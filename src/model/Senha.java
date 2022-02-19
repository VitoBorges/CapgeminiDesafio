package model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

	public static String password = " ";
	public static Integer resultDig = 0;
	public static Integer resultSize = 0;

	public void start() {

		consolePass();
		verifySize(password);
		verifyDigit(password);
		verifyUpperCase(password);
		verifyLowCase(password);
		verifyCharacter(password);

		if (resultSize < 1 && resultDig < 1) {
			System.out.println("Sua senha é forte");
		} else {
			System.out.println(Math.max(resultSize, resultDig));
		}

	}

	public static void consolePass() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		password = scanner.nextLine();
		scanner.close();

	}

	public static void verifySize(String password) {

		if (password.length() < 6) {
			resultSize = 6 - password.length();
		}

	}

	public static void verifyDigit(String password) {

		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			resultDig++;
		}

	}

	public static void verifyUpperCase(String password) {

		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			resultDig++;
		}

	}

	public static void verifyLowCase(String password) {

		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			resultDig++;
		}

	}

	public static void verifyCharacter(String password) {

		Pattern pattern = Pattern.compile("[!@#$%^&*()-+]");
		Matcher matcher = pattern.matcher(password);

		if (!matcher.find()) {
			resultDig++;
		}

	}

}
