package model;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

	public static String word;
	public static Integer result = 0;
	
	Scanner scanner = new Scanner(System.in);

	public void start() {
		
		System.out.println();
		System.out.print("Digite 1: ");
		word = scanner.nextLine();

		getWordFrag(word);

		System.out.println(result);
	}

	public static void getWordFrag(String word) {

		int wordSize = word.length();

		for (int j = 1; j < wordSize; j++) {

			for (int i = 0; i < (wordSize - j); i++) {

				String wordFrag = word.substring(i, i + j);

				commute(word, wordFrag, i);
			}
		}
	}

	public static void commute(String word, String wordFrag, int i) {
		char[] wordFragChar = wordFrag.toCharArray();
		Arrays.sort(wordFragChar);

		for (int position = (i + 1); position <= (word.length() - wordFrag.length()); position++) {

			char[] wordChar = word.substring(position, position + wordFrag.length()).toCharArray();
			Arrays.sort(wordChar);

			if (Arrays.equals(wordFragChar, wordChar)) {
				result++;
			}
		}
	}

}
