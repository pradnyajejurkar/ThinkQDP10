package com.assignments;
/*WAP to replace the negative elements in an array with immendiate left elements square
ar={1,2,-3,2,-4,-6}
o/p={1,2,4,2,4,16}*/

import java.util.Arrays;

public class ReplaceNegativeElement {

	public static void replaceNegative(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				i--;
				int square=arr[i]*arr[i];
				i++;
				arr[i]=square;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,-3,2,-4,-6};
		
		System.out.println(Arrays.toString(arr));
		
		replaceNegative(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
