package com.codingBat.arrays2;

/**
 * Given an array of ints, return true 
 * if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.


either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 * 
 */
public class Either24 {
	
	
	
	public static void main(String[] args) {
		int arr[]= {3,5,9};
		
		System.out.println(either24(arr));
	}
	
	static boolean either24(int []arr) {
		int n=arr.length;
		boolean has2=false;
		boolean has4=false;
		for(int i=0; i<n-1;i++){
			if(arr[i]==2 && arr[i+1]==2) 	
			 has2=true;
			if(arr[i]==4 && arr[i+1]==4) 
				has4=true;
		}
		
		if(has2 && has4)
			return false;
		else if(has2 || has4)
			return true;
		else
			return false;
		
		
	}

}
