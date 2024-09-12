package com.codingBat.arrays2;

public class WithoutTen {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 10, 2 };
		withoutTen(arr);

		for (int nums : arr) {
			System.out.print(nums);
		}
	}

	static int[] withoutTen(int[] nums) {
		if(nums.length<1)
			return nums;
		
		for(int i=0;i<nums.length-1;i++) {
			int temp=nums[i];
			if(nums[i]==10) {
				nums[i]=0;   // 1,0,0,2
				}
			
			
		}
		return nums;
	}
		
}
