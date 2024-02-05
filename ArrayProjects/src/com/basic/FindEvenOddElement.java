package com.basic;

import java.util.Arrays;

public class FindEvenOddElement {
	
	
	
	public static void findEvenOdd(int arr[]) {
		int evenno[]=new int[5];
		int oddno[]=new int[5];
		
		int indexeven=0,indexodd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
			{
				evenno[indexeven]=arr[i];
				indexeven++;
			}
			else
			{
				oddno[indexodd]=arr[i];
				indexodd++;
			}
		}
		System.out.println("even array:"+Arrays.toString(evenno));
		System.out.println("odd array:"+Arrays.toString(oddno));
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		//System.out.println();
		findEvenOdd(arr);
		
		

	}
}
