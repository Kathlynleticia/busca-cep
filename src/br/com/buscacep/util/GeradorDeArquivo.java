package br.com.buscacep.util;

import br.com.buscacep.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {
    public void salvaJson(List<Endereco> endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter("Cep.json");
        fileWriter.write(gson.toJson(endereco));
        fileWriter.close();
    }
}
