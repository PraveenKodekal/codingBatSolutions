package com.codingBat.string2;

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
public class CatDog {
	public static void main(String[] args) {
		String str="catxdogxxdogca";
		System.out.println(catDog(str));
	}

	private static boolean catDog(String str) {
		int len = str.length()-2;
		int diff = 0;
		for(int i = 0; i < len; i++)
		{
			if(str.charAt(i) == 'c')
			{
				if(str.charAt(i+1) == 'a' && str.charAt(i+2) == 't')
					diff++;
			}
			else if(str.charAt(i) == 'd')
			{
				if(str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g')
					diff--;
			}
		}
		return (diff == 0);
	}

}
