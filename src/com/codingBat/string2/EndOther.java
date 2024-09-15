package com.codingBat.string2;

/**
 * Given two strings, return true if either of the strings appears at the very
 * end of the other string, ignoring upper/lower case differences (in other
 * words, the computation should not be "case sensitive"). Note:
 * str.toLowerCase() returns the lowercase version of a string.
 * 
 * 
 * endOther("Hiabc", "abc") → true endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 * 
 */
public class EndOther {

	public static void main(String[] args) {
		String a="Hiabc";
		String b="abc";
		System.out.println(endOther(a,b));

	}

	private static boolean endOther(String a, String b) {

		int aLen=a.length();
		int bLen=b.length();
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		String end;
		String temp;
		
		if(aLen>=bLen) {
			end=a.substring(aLen-bLen);
			temp=b;
		}else {
			end=b.substring(bLen-aLen);
			temp=a;
		}
		
		return end.equals(temp);
	}

}
