package model;

import java.util.Scanner;

public class Algoritmo {

	public void start() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		Integer n = scanner.nextInt();
		scanner.close();

		String charAsterisk = "*";
		String charSpace = " ";

		for (int line = 1; line <= n; line++) {
			System.out.println(charSpace.repeat(n - line) + charAsterisk.repeat(line));
		}

	}

}
