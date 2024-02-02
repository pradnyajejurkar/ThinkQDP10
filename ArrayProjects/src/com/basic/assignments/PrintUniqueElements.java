package com.basic.assignments;

import java.util.Arrays;

//WAP to print all unique elements in the array.


public class PrintUniqueElements {

	public static void printUniqueElement(int arr[]) {
		int index=0;
	  for(int i=0;i<arr.length;i++) {
		  int flag=0;
		  for(int j=0;j<i;j++) {
			  if(arr[i]==arr[j]) {
				  flag=1;
				  break;
			  }
		  }
			  if(flag==0)
			  {
				  
			  }
					System.out.println(arr[i]+ " ");
			
		  }
	  }
	}
	
	public static void main(String[] args) {
		int arr[]= {10,3,5,3,9,22,4,3,1,5,6};
		
		System.out.println(Arrays.toString(arr));
		printUniqueElement();
		
		
	}

}
