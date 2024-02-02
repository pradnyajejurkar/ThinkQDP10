package com.basic;

import java.util.Arrays;

public class PassinArray {
	
	//static method
	static void squareElements(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=ar[i]*ar[i];
		}
		
		System.out.println("inside method");
		System.out.println(Arrays.toString(ar));
	}

	
	//non static method

	int sumOfElements(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
	  int arr[]= {5,6,4,2,3};
	  
	  int a[]= {4,3,7,8};
	  
	  System.out.println(arr);//object inherit
	  
	  System.out.println(Arrays.toString(arr));
	  
	  //display:using loop
	  
	
	  squareElements(arr);
	  System.out.println("------------------------------------");
	  
	  System.out.println(Arrays.toString(arr));
	  
	  System.out.println(Arrays.toString(a));
	  
	  
	  squareElements(a);
	  System.out.println("------------------------------------");
	  System.out.println(Arrays.toString(a));
	  
	  System.out.println("------------------------------------");
	  
	  PassinArray obj=new PassinArray();
	  
	  //obj.sumOfElements({6,7,8,9});
	  //Anonumous array
	  
	  
	  
	  System.out.println("Sum is:"+ obj.sumOfElements(new int[]{6,7,8,9}));
		
		int a1[]= {1,2,48,9};
		
		System.out.println("sum is :"+obj.sumOfElements(a1));
	  }
	  
	  
	  
	  
	}


