# **Capgemini Desafio**

Este é um projeto elaborado para atender o desafio proposto pela Academia Capgemini. Nele contém três pequenos programas: um algoritmo que forma uma escada, um verificador de senha e um contador de anagramas.

## **Tecnologias:**

- Linguagem Java utilizando a versão JRE11
- JUnit 5 Framework para elaboração dos testes unitários
- Apache Maven
- Por ser um projeto simples, não houve a necessidade utilizar Spring Boot

## **Rodar o Projeto na IDE:**

- Git clone https://github.com/VitoBorges/CapgeminiDesafio.git
- Faça a importação do projeto para IDE
- Ao rodar a aplicação, um menu dará instruções de como utilizar as funcionalidades
- É possível rodar os testes unitários automatizados

## **Rodar o Projeto no Prompt:**

Para rodar a aplicação é necessário ter o Maven instalado e configurado.

- Git clone https://github.com/VitoBorges/CapgeminiDesafio.git
- Abra o prompt no diretório do projeto
- Digite o comando `mvn install`
- Digite o comando `mvn exec:java -Dexec.mainClass="br.com.capgemini.desafio.App"`

## **Rodar os Testes no Prompt:**

Ao executar o projeto, o maven executará os testes no momento do building

```
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running br.com.capgemini.desafio.AnagramaTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.132 s - in br.com.capgemini.desafio.AnagramaTest
[INFO] Running br.com.capgemini.desafio.SenhaTest
[INFO] Tests run: 22, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.117 s - in br.com.capgemini.desafio.SenhaTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 27, Failures: 0, Errors: 0, Skipped: 0
[INFO]
```
