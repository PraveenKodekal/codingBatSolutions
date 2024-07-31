package com.codingBat.arrays2;



/**
 * Given an array of ints, 
 * return true if the array contains 
 * either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */
public class ModThree {
	public static void main(String[] args) {
		int [] arr= {1, 2, 1, 2, 1};
		System.out.println(modThree(arr));
	}
	
	static boolean modThree(int [] arr) {
		int countEven=0;
		int countOdd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				countEven++;
			}
				
			else
				countOdd++;
		}
		System.out.println(countEven+" -- "+countOdd);
		if(countEven>=3 || countOdd >=3)
			return true;
		
		return false;
	}

}
