package com.codingBat.string2;

/**
 * Return the number of times that the string "hi" appears anywhere in the given
 * string.
 * 
 * 
 * countHi("abc hi ho") → 1 countHi("ABChi hi") → 2 countHi("hihi") → 2
 * 
 */
public class CountHi {

	public static void main(String[] args) {
		String str = "abc hi ho";
		System.out.println(countHi(str));
	}

	private static int countHi(String str) {
		int count = 0;
		int len = str.length() - 1;

		

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
				
			count++;
		}
		return count;
	}

}
