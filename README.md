# 📍 BuscaCEP

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![API](https://img.shields.io/badge/API-ViaCEP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow?style=for-the-badge)

---

## 📖 Sobre o projeto

O **BuscaCEP** é uma aplicação desenvolvida em Java que realiza consultas de endereços a partir de um CEP utilizando a API pública do ViaCep.<br>

A cada execução, a aplicação consome a API, processa os dados retornados e os armazena localmente em um arquivo JSON.

Este projeto foi desenvolvido durante meus primeiros estudos em Java, com foco em prática de consumo de APIs e manipulação de dados.

---

## Funcionalidades

- Consulta de endereço via CEP  
- Consumo de API externa (ViaCEP)  
- Conversão de resposta para JSON  
- Salvamento de dados em arquivo local  
- Exibição dos dados no terminal  

## Tecnologias utilizadas

- Java
- HTTP Client
- Manipulação de JSON
- API ViaCEP

---
## Como executar o projeto

Pré-requisitos
- Java JDK instalado
- IntelliJ IDEA (ou outra IDE)
- Conexão com a internet

## Passo a passo
- Clone o repositório:
git clone https://seu-repositorio-aqui.git
- Abra o projeto na IDE IntelliJ IDEA
- Execute a classe principal (Main)
- Informe o CEP desejado no console
- Os endereços só são salvos no arquivo JSON após o usuário digitar “sair”. Caso o programa seja encerrado de outra forma, os dados não serão persistidos.
- O resultado será exibido e salvo automaticamente em um arquivo JSON

## Estrutura do retorno

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "localidade": "São Paulo",
  "uf": "SP"
}
```
## Persistência de dados

Este projeto não utiliza banco de dados.<br>
Os dados são persistidos em um arquivo JSON local, sendo sobrescritos a cada execução. Não há histórico de consultas anteriores.

## Aprendizados

- Consumo de APIs REST
- Manipulação de JSON
- Estruturação de projetos em Java
- Leitura e escrita de arquivos
- Organização de código

