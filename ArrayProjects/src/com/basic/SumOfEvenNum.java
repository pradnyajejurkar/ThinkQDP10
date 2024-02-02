package com.basic;

public class SumOfEvenNum {

	public int evenSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumOfEvenNum s1=new SumOfEvenNum();
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println("Sum of even Number:"+s1.evenSum(arr));
	
		//using anonymous array
		
		System.out.println("Sum of even Numbers:"+s1.evenSum(new int[] {4,5,6}));
		
	}

}
