package com.basic.assignments;

import java.util.Arrays;

public class CubeOfNum {

	static void findCube(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       int arr[]= {2,3,4,5};
      
       System.out.println(Arrays.toString(arr));
       
       System.out.println("-----------------------------------");
       findCube(arr);
	}

}
