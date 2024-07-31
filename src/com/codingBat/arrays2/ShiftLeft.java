package com.codingBat.arrays2;

public class ShiftLeft {
	public static void main(String[] args) {
		int[] arr= {3,5,6};
		System.out.println(shiftLeft(arr));
		for(int nums:arr) {
			System.out.println(nums);
		}
		
	}
	static int[] shiftLeft(int[]nums) {
		
		if(nums.length < 1)
	        return nums;
		
		int n=nums.length;
		
		int temp=nums[0];
		int[] nums1=new int[n];
		for(int i=1;i<nums.length;i++) {
			nums[i-1]=nums[i];
			
		}
		nums[nums.length-1]=temp;
		return nums;
		
	}

}
