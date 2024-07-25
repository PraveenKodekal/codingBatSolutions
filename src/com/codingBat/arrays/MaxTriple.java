package com.codingBat.arrays;

public class MaxTriple {
	
	public static void main(String[] args) {
		int []nums= {5, 1, 7, 10, 7, 8, 8};
		System.out.println(maxReturn(nums));
	}
	
	static int maxReturn(int nums[]) {
		int max=0;
		int start=nums[0];
		int middle=nums[nums.length/2];
		int end=nums[nums.length-1];
		
		if(start>middle && start>end)
			max=start;
		if(middle>start && middle>end)
			max=middle;
	    if(end>start && end>middle)
		max=end;
		
		return max;
	}

}
