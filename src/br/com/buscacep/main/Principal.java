package br.com.buscacep.main;

import br.com.buscacep.model.Endereco;
import br.com.buscacep.service.ConsultaCep;
import br.com.buscacep.util.GeradorDeArquivo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();
        String cep = "";
        List<Endereco> enderecos = new ArrayList<>();

        while (!cep.equalsIgnoreCase("sair")) {
            System.out.println("Digite um número de CEP, (apenas numeros) ou sair para finalizar. ");
            cep = scanner.nextLine();

            if (cep.equalsIgnoreCase("sair"))
                break;

            if (!cep.matches("\\d{8}")) {
                System.out.println("CEP inválido!");
                continue;
            }

            try {
                Endereco novoEndereco = consulta.buscaEndereco(cep);
                System.out.println(novoEndereco);
                enderecos.add(novoEndereco);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        try {
            geradorDeArquivo.salvaJson(enderecos);
            System.out.println("Arquivo único gerado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

}