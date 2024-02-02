package com.basic.assignments;
//WAP to count frequency of each element in an array.
import java.util.Arrays;

public class CountFrequency {
	
	static void countFrequency(int arr[]) {
	   for(int i=0;i<arr.length;i++) {
		   int flag=0,count=0;
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]==arr[j]) {
				   flag=1;
				   break;
			   }
		   }
		   if(flag==1) {
			   continue;
		   }  
			   for(int j=0;j<=i;j++) {
				   if(arr[i]==arr[j])
					count++;   
			}
			   System.out.println(arr[i]+ " : " +count);
		   }
	   }
	

	public static void main(String[] args) {
		int arr[]= {5,8,5,7,8,10};
		
		System.out.println(Arrays.toString(arr));
		
		countFrequency(arr);
	}

}
