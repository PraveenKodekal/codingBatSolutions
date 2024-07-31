package com.codingBat.arrays2;

/**
 * 
Given an array of ints, return true if the 
value 3 appears in the array exactly 3 times, 
and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 * 
 */
public class HaveThree {
	public static void main(String[] args) {
		int arr[]= {3,1,1,3,1,3};
		System.out.println(haveThree(arr));
		
	}
	
	static boolean haveThree(int nums[]) {
		int count=0;
		boolean has3=false;
		int temp=nums[nums.length-1];
		
		if(temp==3)
			count++;
		for(int i=0;i<nums.length-1;i++) {
			
			if(nums[i]==3 && nums[i+1]==3) {
				has3=false;
				break;
			}
			else if(nums[i]==3){
				has3=true;
				//i=i+1;
				count++;
			}
			
			
		}
		System.out.println(count);
		if(count==3)
	return has3;
		else
			return false;
	}

}
