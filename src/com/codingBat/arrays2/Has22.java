package com.codingBat.arrays2;



/**
 * Given an array of ints, return true if the 
 * array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 * 
 */
public class Has22 {
	
	public static void main(String[] args) {
		int [] arr= {2, 1, 2,2};
		System.out.println(has22(arr));
	}
	
	static boolean has22(int []nums) {
		int n= nums.length;
		
		for(int i=0;i<n-1;i++) {
			if(nums[i]==2 && nums[i+1]==2) 
				return true;		
		}
		
		return false;
	}

}
