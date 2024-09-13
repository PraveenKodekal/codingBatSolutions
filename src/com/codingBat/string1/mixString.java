package com.codingBat.string1;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings, a and b, create a bigger string made of the first char of
 * a, the first char of b, the second char of a, the second char of b, and so
 * on. Any leftover chars go at the end of the result.
 * 
 * 
 * mixString("abc", "xyz") → "axbycz" mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 * 
 */
public class mixString {
	public static void main(String[] args) {
		String a="Hi";
		String b="there";
		
		mixString(a,b);
	}

	private static void mixString(String a, String b) {
		
		int aLen=a.length();
		int bLen=b.length();
		
		List<String> list= new ArrayList<>();
		
		StringBuilder stbuild= new StringBuilder(aLen+bLen);
		int i=0;
		for(; i < aLen && i < bLen; i++)
		{
			stbuild.append(a.charAt(i));
			stbuild.append(b.charAt(i));
		}
		// only 1 for loop will actually run
		for(; i < aLen; i++)
			stbuild.append(a.charAt(i));
		for(; i < bLen; i++)
			stbuild.append(b.charAt(i));
		
	
		String s= stbuild.toString();
		
		for(int p=0;p<s.length();p++) {
			System.out.print(s.charAt(p));
		}
		
		
		
	}

}
