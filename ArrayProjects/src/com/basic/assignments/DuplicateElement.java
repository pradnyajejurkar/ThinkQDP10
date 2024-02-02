package com.basic.assignments;
/*WAP to find and count total number of duplicate elements in an array.*/
import java.util.Arrays;

public class DuplicateElement {

	public static int countDuplicateElement(int arr[]) {
	  int dup_count=0;
	  
	  for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]==arr[j]) {
				 dup_count++;
				 break;
			  }
		  }
	  }
	  return dup_count;
	}
	
	public static void main(String[] args) {
		int arr[]= {4,22,19,4,22,11,4,19,9,19};
		
		System.out.println(Arrays.toString(arr));
		countDuplicateElement(arr);
		
		int dup_ct=countDuplicateElement(arr);
		System.out.println("Total Number of Duplicate count is:"+dup_ct);
	}

}
