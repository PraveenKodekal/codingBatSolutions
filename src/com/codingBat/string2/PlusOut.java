package com.codingBat.string2;

/**
 * Given a string and a non-empty word string, return a version of the original
 * String where all chars have been replaced by pluses ("+"), except for
 * appearances of the word string which are preserved unchanged.
 * 
 * 
 * plusOut("12xy34", "xy") → "++xy++" plusOut("12xy34", "1") → "1+++++"
 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */
public class PlusOut {
	public static void main(String[] args) {
		String str = "12xy34";
		String word="xy";
		System.out.println(plusOut1(str, word));
	}

	private static String plusOut(String str, String word) {
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}

	private static String plusOut1(String str,String word) {
		int len = str.length();
		int wLen = word.length();
		int pos = str.indexOf(word);
		int i = 0;
		StringBuilder stbuild = new StringBuilder(len);
		while (pos != -1) {
			while (i < pos) {
				stbuild.append('+');
				i++;
			}
			stbuild.append(word);
			i = pos + wLen;
			pos = str.indexOf(word, i);
		}
		for (; i < len; i++)
			stbuild.append('+');
		return stbuild.toString();
	}
}
