package com.codingBat.arrays;




/**
 * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */
public class MakeMiddle {
	public static void main(String[] args) {
		int arr[]= {7, 1, 2, 3, 4, 9};
		
		makeMiddle(arr);
	}
	static int[] makeMiddle(int[] nums) {
		  int n=nums.length/2;
		  int []nums1=new int[2];
		  nums1[0]=nums[n-1];
		  nums1[1]=nums[n];
		  
		  return nums1;
		  
		}
	

}
