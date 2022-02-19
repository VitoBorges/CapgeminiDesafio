package model;

import java.util.Scanner;

public class Algoritmo {
	
	static Scanner scanner = new Scanner(System.in);

	public void start() {

		System.out.println();
		System.out.print("Digite o valor de n: ");
		Integer n = scanner.nextInt();

		String charAsterisk = "*";
		String charSpace = " ";

		for (int line = 1; line <= n; line++) {
			System.out.println(charSpace.repeat(n - line) + charAsterisk.repeat(line));

		}

	}

}
