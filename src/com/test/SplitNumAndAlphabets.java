package com.test;

public class SplitNumAndAlphabets {
	
	public static void main(String[] args) {
		
		String s = "ja1v3f4+5";
		String letter = "";
		String number = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				letter = letter+c;
				
			} else if (Character.isDigit(c)) {
				number = number+c;
			} 
			
		}
		
		System.out.println(letter);
		System.out.println(number);
		
	}

}
