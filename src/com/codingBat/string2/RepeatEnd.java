package com.codingBat.string2;

/**
 * Given a string and an int n, return a string made of n repetitions of the
 * last n characters of the string. You may assume that n is between 0 and the
 * length of the string, inclusive.
 * 
 * 
 * repeatEnd("Hello", 3) → "llollollo" repeatEnd("Hello", 2) → "lolo"
 * repeatEnd("Hello", 1) → "o"
 * 
 */
public class RepeatEnd {
	public static void main(String[] args) {
		int n=2;
		String str="Hello";
		
		repeatEnd(str, n);
		
	}

	private static void repeatEnd(String str, int n) {
		
		StringBuilder build = new StringBuilder(n*n);
		String st=str.substring(str.length()-n);
		
		for(int i=0;i<n;i++) {
			build.append(st);
		}
		
		for(int p=0; p<build.length();p++) {
			System.out.print(build.charAt(p));
		}
		
		
	}

}
