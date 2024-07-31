package com.codingBat.arrays2;

/**
 * Return true if the array contains, somewhere, three increasing adjacent
 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
 * 
 * 
 * tripleUp([1, 4, 5, 6, 2]) → true tripleUp([1, 2, 3]) → true tripleUp([1, 2,
 * 4]) → false
 * 
 */
public class TripleUp {
	public static void main(String[] args) {
		int arr[] = {4,5,6,1,2};
		System.out.println(tripleUp(arr));
	}
	
	static boolean tripleUp(int[] nums) {
		int n= nums.length;	
		
		
		for(int i=1; i<n-2;i++) {
			int temp=nums[i];
			int t=nums[i+1];
			if(temp==t-1 && temp+1==t) {
				return true;
			}
		}		
		return false;
	}
}
