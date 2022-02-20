package br.com.capgemini.desafio;

import java.util.Scanner;

public class App {

	static Algoritmo algoritmo = new Algoritmo();
	static Senha senha = new Senha();
	static Anagrama anagrama = new Anagrama();
	static Scanner scanner = new Scanner(System.in);

	public static Integer select;

	public static void main(String[] args) {

		userOption(select);
	}

	public static void userOption(Integer select) {

		do {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println(" Selecione a opção desejada: ");
			System.out.println("-----------------------------");
			System.out.println(" 1) Algoritmo de Escada");
			System.out.println(" 2) Verificar Senha");
			System.out.println(" 3) Anagrama de Palavras");
			System.out.println(" 4) Sair");

			select = scanner.nextInt();

			switch (select) {

			case 1:
				algoritmo.start();
				break;
			case 2:
				senha.start();
				break;
			case 3:
				anagrama.start();
				break;
			case 4:
				break;

			default:
				System.out.println(" Opção Inválida ");
				break;
			}
		} while (select < 4);
	}
}
