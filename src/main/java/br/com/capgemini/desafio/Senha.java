package br.com.capgemini.desafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

	public static String password = " ";

	static Scanner scanner = new Scanner(System.in);

	public void start() {

		Integer resultDig = 0;
		Integer resultSize = 0;

		consolePass();
		resultSize = verifySize(password);
		resultDig = verifyDigit(password);
		resultDig += verifyUpperCase(password);
		resultDig += verifyLowCase(password);
		resultDig += verifyCharacter(password);

		if (resultSize < 1 && resultDig < 1) {
			System.out.println("Sua senha é forte");
		} else {
			System.out.println(Math.max(resultSize, resultDig));
		}
	}

	public static void consolePass() {

		System.out.println();
		System.out.print("Digite a senha: ");
		password = scanner.nextLine();
	}

	public Integer verifySize(String password) {

		if (password.length() < 6) {
			return 6 - password.length();
		}
		return 0;
	}

	public Integer verifyDigit(String password) {

		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			return 1;
		}
		return 0;
	}

	public Integer verifyUpperCase(String password) {

		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			return 1;
		}
		return 0;
	}

	public Integer verifyLowCase(String password) {

		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			return 1;
		}
		return 0;
	}

	public Integer verifyCharacter(String password) {

		Pattern pattern = Pattern.compile("[!@#$%^&*()-+]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			return 1;
		}
		return 0;
	}
}
