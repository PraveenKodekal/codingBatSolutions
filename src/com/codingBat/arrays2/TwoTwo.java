package com.codingBat.arrays2;

/**
 * Given an array of ints, return true if every 2 that appears in the array is
 * next to another 2.
 * 
 * 
 * twoTwo([4, 2, 2, 3]) → true twoTwo([2, 2, 4]) → true twoTwo([2, 2, 4, 2]) →
 * false
 */
public class TwoTwo {

	public static void main(String[] args) {
		int arr[] = {4,2,2,2 };
		System.out.println(two2(arr));
	}

	static boolean two2(int[] nums) {
		boolean has2 = false;
		int count = 0;
		
		if(nums[0]==2) {
			count++;
		}

		int n = nums.length;
		for (int i = 1; i < n; i++) {
			if (nums[i-1] == 2 && nums[i] == 2) {
				
				has2 = true;
			
			}
			if(nums[i]==2)
				count++;
			
		}
		System.out.println(count);

		if (count == 2)
			return has2;
		else
			return false;
	}

}
