package org.strings;

import java.util.*;

public class ReverseArrayListString {

	public static void main(String[] args) {

		ArrayList<String> original = new ArrayList<>(Arrays.asList("test", "array", "list", "map", "set"));

		original.add("test");
		original.add("array");
		original.add("anand");
		original.add("kavi");
		
		ArrayList<String> reversedListString = reversedListString(original);

		for (String string : reversedListString) {

			System.out.println("Final output   :" + string);

		}

		
		System.out.println("Original String :" + original);
		Collections.reverse(original);
		System.out.println("Original String :" + original);

	}

	public static String reverseWord(String str) {

		StringBuilder reversedWord = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {

			char charAt = str.charAt(i);

			reversedWord.append(charAt);
		}

		String string = reversedWord.toString();
		System.out.println("Reversed wor    :" + string);

		return string;
	}

	public static ArrayList<String> reversedListString(ArrayList<String> original) {

		ArrayList<String> reversedListOfWords = new ArrayList<>();

		for (String word : original) {

			String[] words = word.split(" ");

			StringBuilder reversedAllwords = new StringBuilder();

			for (int i = words.length - 1; i >= 0; i--) {

				reversedAllwords.append(reverseWord(words[i])).append(" ");

			}

			String string = reversedAllwords.toString();
			reversedListOfWords.add(string);

		}

		System.out.println("ALL Words  :" + reversedListOfWords);
		return reversedListOfWords;
	}

}
