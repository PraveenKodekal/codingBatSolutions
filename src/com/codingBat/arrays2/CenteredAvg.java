package com.codingBat.arrays2;

import java.util.Arrays;

public class CenteredAvg {

	public static void main(String[] args) {
		int[] arr = { -10, -4, -2, -4, -2, 0 };
		System.out.println(centeredAverage(arr));
	}

	static int centeredAverage(int[] nums) {
		int avg = 0;
		int sum = 0;
		int count = 0;

		 Arrays.sort(nums);
		 for(int i=1;i<nums.length-1;i++) {
			 sum=sum+nums[i];
			 count++;
		 }

		
		avg = sum / count;

		return avg;
	}

}
