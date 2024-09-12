package com.codingBat.arrays2;

import java.util.ArrayList;

public class Prepz4 {
	public static void main(String[] args) {
		int []arr= {1,4};
		System.out.println(prep4(arr));
		for(int nums:arr) {
			System.out.println(nums);
		}
	}
	
	static int[] prep4(int [] nums) {
		int i=0;
		
		while(nums[i]!=4) {
			i++;
		}
		int[] arr=new int[i];
		for(int j=0; j< i;j++) {
			arr[j]=nums[j];
		}
		return arr;
	}

}
