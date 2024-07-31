package com.codingBat.arrays2;

/**
 * 
 * Given an array of ints, 
 * return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
public class Has12 {
	public static void main(String[] args) {
		int arr[]= {4, 3, 2};
		System.out.println(has12(arr));
	}
	static boolean has12(int []nums) {
		boolean has1=false;
		boolean has2=false;
		
		for(int i=0; i<nums.length;i++) {
		if(nums[i]==1) {
			has1=true;
		}
		if(has1 && nums[i]==2)
			has2=true;
		}
		if(has1 && has2)
			return true;
		return false;
	}

}
