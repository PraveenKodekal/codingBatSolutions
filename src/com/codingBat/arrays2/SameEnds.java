package com.codingBat.arrays2;


/**
 * Return true if the group of N numbers 
 * at the start and end of the array are the same. 
 * For example, with {5, 6, 45, 99, 13, 5, 6}, 
 * the ends are the same for n=0 and n=2, and false for n=1 and n=3. 
 * You may assume that n is in the range 0..nums.length inclusive.


sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 * 
 */
public class SameEnds {
	public static void main(String[] args) {
		int arr[] = {4,5, 6, 45, 99, 13, 5, 6};
		int n=4;
		System.out.println(sameEnds(arr,n));
	}
	
	static boolean sameEnds(int [] nums, int len) {
		int first=nums[0];
		int second =nums[1];
		int n=nums.length;
		for(int i=len;i<nums.length;i++) {
		if(len%2==0) {
			if(nums[n-1]==second && nums[n-2]==first) {
				return true;
			}
		}
		}
		return false;
	}

}
