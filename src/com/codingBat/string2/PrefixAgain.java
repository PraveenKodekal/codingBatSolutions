package com.codingBat.string2;

/**
 * Given a string, consider the prefix string made of the first N chars of the
 * string. Does that prefix string appear somewhere else in the string? Assume
 * that the string is not empty and that N is in the range 1..str.length().
 * 
 * 
 * prefixAgain("abXYabc", 1) → true prefixAgain("abXYabc", 2) → true
 * prefixAgain("abXYabc", 3) → false
 * 
 */
public class PrefixAgain {
	public static void main(String[] args) {
		int n=2;
		String str="abXYabcab";
		System.out.println(prefixAgain(str, n));
	}

	private static boolean prefixAgain(String str, int n) {
		String s= str.substring(0,n);
		 return (str.indexOf(s, 1) != -1);
	}

}
