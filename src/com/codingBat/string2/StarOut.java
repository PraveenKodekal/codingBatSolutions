package com.codingBat.string2;

/**
 * Return a version of the given string, where for every star (*) in the string
 * the star and the chars immediately to its left and right are gone. So "ab*cd"
 * yields "ad" and "ab**cd" also yields "ad".
 * 
 * 
 * starOut("ab*cd") → "ad" starOut("ab**cd") → "ad" starOut("sm*eilly") →
 * "silly"
 * 
 */
public class StarOut {
	public static void main(String[] args) {
		String str="ab*cd";
		System.out.println(starOut(str));
	}

	private static String starOut(String str) {
		int len = str.length();
		int[] indexes = new int[len];
		char ch;
		StringBuilder stbuild = new StringBuilder(len);
		for(int i = 0; i < len; i++)
		{
			if(str.charAt(i) == '*')
			{
				indexes[i] = 1;
				if(i >= 1)
					indexes[i-1] = 1;
				if(i < (len-1))
					indexes[i+1] = 1;
			}
		}
		for(int i = 0; i < len; i++)
		{
			if(indexes[i] == 0)
				stbuild.append(str.charAt(i));
		}
		return stbuild.toString();
	}

}
