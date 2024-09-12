package com.codingBat.arrays2;

public class ZeroMax {
	
	public static void main(String[] args) {
		int[] arr= {0,8,3,7,3,6,0};
		zeroMax(arr);
		for(int nums:arr)
			System.out.print(nums+" ");
	}
	
	static int[] zeroMax(int [] nums) {
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			
			for(int j=1;j<nums.length;j++) {
				if(nums[j]>max) {
					max=nums[j];
				}
			}
			
			if(nums[i]==0) {
				
				nums[i]=max;
			}
		}
		System.out.println(max+" - ");
		
		return nums;
	}

}
