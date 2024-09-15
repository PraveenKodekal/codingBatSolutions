package com.codingBat.string2;

/**
 * 
 * A sandwich is two pieces of bread with something in between. Return the
 * string that is between the first and last appearance of "bread" in the given
 * string, or return the empty string "" if there are not two pieces of bread.
 * 
 * 
 * getSandwich("breadjambread") → "jam" getSandwich("xxbreadjambreadyy") → "jam"
 * getSandwich("xxbreadyy") → ""
 */
public class SandwichProblem {

	public static void main(String[] args) {
		String str="breadpambread";

		System.out.println(sandwhich(str));
	}

	private static String sandwhich(String str) {

		int iFirst=str.indexOf("bread");
		int iLast=str.lastIndexOf("bread");
		
		if(iFirst !=-1 && iLast!=-1 && iFirst != iLast)
			return str.substring(iFirst+5, iLast);
		
		return "";
	}

}
