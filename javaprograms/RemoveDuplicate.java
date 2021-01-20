package com.javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
	 
		String text = "welcoome to test yaantra";
		String duplicate="";
		char[] charArray = text.toCharArray();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<charArray.length;i++)
		{
			set.add(charArray[i]);
		}
		for (Character character : set) {
			//System.out.print(character);
			System.out.print(duplicate+character);
		}
	}
}
