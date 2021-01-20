package com.javaprograms;

public class StringReverse {

	public static void main(String[] args) {
		String text = "welcome to test yantra";
		String reverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse = reverse + text.charAt(i);
		}
		System.out.println(reverse);
	}

}
