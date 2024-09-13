package com.codingBat.string1;

/**
 * Given a string and an int n, return a string made of the first n characters
 * of the string, followed by the first n-1 characters of the string, and so on.
 * You may assume that n is between 0 and the length of the string, inclusive
 * (i.e. n >= 0 and n <= str.length()).
 * 
 * 
 * repeatFront("Chocolate", 4) → "ChocChoChC" repeatFront("Chocolate", 3) →
 * "ChoChC" repeatFront("Ice Cream", 2) → "IcI"
 * 
 */
public class RepeatFront {
	public static void main(String[] args) {
		int n=4;
		String str="Chocolate";
		
		repeatFront(str, n);
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
	}

	private static String repeatFront(String str, int n) {
		
		StringBuilder stbuild = new StringBuilder((n*n + n)/2);
		for(int i = n; i >= 1; i--)
		{
			for(int k = 0; k < i; k++)
				stbuild.append(str.charAt(k));
		}
		return stbuild.toString();
	}

}
