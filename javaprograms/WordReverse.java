package com.javaprograms;

public class WordReverse {

	public static void main(String[] args) {
		String s="welcome to test yantra";
		String rw="";
		String rs="";
		String[] allwords = s.split(" ");
		for (String word : allwords) {
			for(int i=word.length()-1;i>=0;i--)
			{
				rw=rw+word.charAt(i);
			}
			
		}
		rs=rs+rw;
		System.out.println(rs);	
	}

}
