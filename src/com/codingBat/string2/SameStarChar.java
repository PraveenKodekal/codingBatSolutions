package com.codingBat.string2;

/**
 * Returns true if for every '*' (star) in the string, if there are chars both
 * immediately before and after the star, they are the same.
 * 
 * 
 * sameStarChar("xy*yzz") → true sameStarChar("xy*zzz") → false
 * sameStarChar("*xa*az") → true
 * 
 */
public class SameStarChar {
	public static void main(String[] args) {
		String str="xy*yzz";
		System.out.println(sameStarChar(str));
	}

	private static boolean sameStarChar(String str) {
		char ch='*';
		if(str.length()<3) {
			return false;
		}
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)=='*') {
				if(str.charAt(i-1)!=(str.charAt(i+1)))
					return true;
			}
		}
		return true;
	}

}
