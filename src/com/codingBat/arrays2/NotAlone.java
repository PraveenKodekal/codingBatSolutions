package com.codingBat.arrays2;

/**
 * We'll say that an element in an array is "alone" if there are values before
 * and after it, and those values are different from it. Return a version of the
 * given array where every instance of the given value which is alone is
 * replaced by whichever value to its left or right is larger.
 * 
 * 
 * notAlone([1, 2, 3], 2) → [1, 3, 3] notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3,
 * 3, 5, 5, 2] notAlone([3, 4], 3) → [3, 4]
 * 
 * 
 */
public class NotAlone {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 3, 2, 6 };
		int val = 1;
		System.out.println(notAlone(arr, val));
		for (int sums : arr) {
			System.out.print(sums);
		}
	}

	static int[] notAlone(int[] nums, int val) {
		 int[] arr = new int[nums.length];
		    
		    if(nums.length >= 1) {
		        arr[0] = nums[0];
		        arr[arr.length-1] = nums[nums.length-1];
		    }
		                  
		    for(int i = 1; i <= nums.length - 2; i++) {
		        if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1])
		            arr[i] = Math.max(nums[i-1], nums[i+1]);
		        else
		            arr[i] = nums[i];
		    }
		                                            
		    return arr;
}
}
