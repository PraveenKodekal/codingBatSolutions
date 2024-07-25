package com.codingBat.arrays2;

import java.util.Arrays;

/**
 * Given an array length 1 or more of ints, return the difference between the 
 * largest and smallest values in the array.
 *  Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods
 *   return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */
public class bigDiff {
	public static void main(String[] args) {
		int nums[]= {10, 3, 5, 6};
		System.out.println(bigDifference(nums));
		System.out.println();
		System.out.println(withBuiltIn(nums));
	}
	
	static int bigDifference(int [] nums) {
		int diff=0;
		
		Arrays.sort(nums);
		int min=nums[0];
		int max=nums[nums.length-1];
		
		System.out.println(max);
		System.out.println(min);
		diff=max-min;
		return diff;
	}
	
	static int withBuiltIn(int[] nums) {
		int diff=0;
		int max= nums[0];
		int min=nums[0];
		for(int number:nums) {
			max=Math.max(max, number);
			min=Math.min(min, number);
		}
		
		return max-min;
	}

}
