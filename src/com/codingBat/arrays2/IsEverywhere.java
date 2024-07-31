package com.codingBat.arrays2;



/**
 * We'll say that a value is "everywhere" in an array
 *  if for every pair of adjacent elements in the array, 
 *  at least one of the pair is that value. 
 *  Return true if the given value is everywhere in the array.


isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 * 
 */
public class IsEverywhere {
	
	public static void main(String[] args) {
		int []arr= {1, 2, 1, 3};
		int n=2;
		System.out.println(isEveryWhere(arr,n));
	}
	
	static boolean isEveryWhere(int []nums,int val) {
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			int temp=nums[i+1];
			if(nums[i]==temp-1) {
				count++;
			}			
		}
		if(count==val)
			return true;
		return false;
		
	}
		
		

}
