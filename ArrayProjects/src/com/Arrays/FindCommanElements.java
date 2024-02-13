package com.Arrays;

import java.util.Arrays;

public class FindCommanElements{
		   
		public static void main(String args[]){
			int arr1[]=new int[]{1,3,6,11,12};
			int arr2[]=new int[]{45,11,9,3,6};
			System.out.println(Arrays.toString(arr1));
		    System.out.println(Arrays.toString(arr2));
			for(int i=0;i<arr1.length;i++){
			  for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
				System.out.println(arr1[i]+ " "+arr2[j]);
			}
		}
		
	}	

}
}	
		
			
		

			
			

