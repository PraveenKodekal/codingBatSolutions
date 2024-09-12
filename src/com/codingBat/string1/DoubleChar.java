package com.codingBat.string1;
/**
 * Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {
	public static void main(String[] args) {
		String str="The";
		System.out.println(doubleChar(str));
		
	}

	private static String doubleChar(String str) {
		int len=str.length();
		StringBuilder str1=new StringBuilder(len*2);
		char ch;
		for(int i=0;i<len;i++) {
			ch=str.charAt(i);
			str1.append(ch);
			str1.append(ch);
		}
		
		
		return str1.toString();
	}

}
