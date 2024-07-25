package com.codingBat.arrays2;

public class FizzArray {
	public static void main(String[] args) {
		int n=3;
		fizzArray(n);
		
	}
	
	static int[] fizzArray(int n) {
		int [] nums= new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=i;
		}
		for(int num:nums)
			System.err.println(num);
		return nums;
		
	}

}
