package com.codingBat.arrays2;

public class FizzArray2 {
	public static void main(String[] args) {
		int n=3;
		System.out.println(fizzArray2(n));
	}
	
	static String[] fizzArray2(int n) {
		  String[] str= new String[n];
		  for(int i=0;i<n;i++){
		    str[i]=""+i+"";
		  }
		  return str;
		}

}
