package com.codingBat.arrays;

/**Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 * 
 */
public class firstOrLast6 {
	
	public static void main(String[] args) {
		int []arr= {1,2,6};
		int arr1[]= {13, 6, 1, 2, 3};
		
		System.out.println(firstAndLast(arr));
		
	}
	
	static boolean firstAndLast(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			if(arr[0]==6||arr[n-1]==6)
				return true;
		}
		
		return false;
	}

}
