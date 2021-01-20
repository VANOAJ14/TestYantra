package com.javaprograms;

public class SwapFirstAndLastWord {
	public static void main(String[] args) {
		String text = "welcome to test yantra";
		String swap = "";
		String[] allwords = text.split(" ");

		int length = allwords.length;

		String temp = allwords[0];
		allwords[0] = allwords[length - 1];
		allwords[length - 1] = temp;

		for (int i = 0; i < length; i++) {
			String string = allwords[i];
			swap = swap + string + " ";
		}
		System.out.println(swap);

	}

}
