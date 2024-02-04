package com.Arrays;

import java.util.Arrays;
//Shift all the even number at the end of array w/o temporary array
public class ShiftEven {

	static void shiftEven(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]%2==0 && i<j) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
			//System.out.println(Arrays.toString(arr));
		}
	}
	
	
	public static void main(String[] args) {
	   int arr[]= {2,3,1,5,6,8,7,9};
	   
	   System.out.println(Arrays.toString(arr));
	   shiftEven(arr);
	   
	   System.out.println(Arrays.toString(arr));
	   

	}

}
