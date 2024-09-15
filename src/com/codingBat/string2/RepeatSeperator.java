package com.codingBat.string2;

/**
 * Given two strings, word and a separator sep, return a big string made of
 * count occurrences of the word, separated by the separator string.
 * 
 * 
 * repeatSeparator("Word", "X", 3) → "WordXWordXWord" repeatSeparator("This",
 * "And", 2) → "ThisAndThis" repeatSeparator("This", "And", 1) → "This"
 * 
 */
public class RepeatSeperator {
	public static void main(String[] args) {
		int n=1;
		String word="This";
		String sep="And";
		int count=1;
		
		repeatSeparator(word, sep, count);
	}

	private static void repeatSeparator(String word, String sep, int count) {

		StringBuilder st= new StringBuilder();
		while(count >0) {
			st.append(false);
			
		}
	}

}
