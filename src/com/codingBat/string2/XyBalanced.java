package com.codingBat.string2;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the
 * string, there exists a 'y' char somewhere later in the string. So "xxy" is
 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
 * the given string is xy-balanced.
 * 
 * 
 * xyBalance("aaxbby") → true xyBalance("aaxbb") → false xyBalance("yaaxbb") →
 * false
 * 
 */
public class XyBalanced {
	public static void main(String[] args) {
		String str="aaxxbby";

		System.out.println(xyBalanced(str));
	
	}

	private static boolean xyBalanced(String str) {
		int cntX=0;
		int cntY=0;
		char ch;
		int len=str.length()-1;
		for(int i=len;i>0;i--) {
			ch=str.charAt(i);
			if(ch=='x') {
				cntX++;
				return false;
			}else if(ch=='y') {
				cntY++;
				return true;
			}
			
			
		}
		
		
		
		return false;
	}

}
