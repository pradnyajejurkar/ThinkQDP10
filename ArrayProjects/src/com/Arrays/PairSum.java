package com.Arrays;
//Find the pair of elements whose sum is equivalent to the given sum

public class PairSum {

static void pairSum(int[] ar,int sum) {
	
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]+ar[j]==sum) {
				System.out.println(ar[i]+" "+ar[j]);
				break;
			}
		}
	}
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum=5;
		pairSum(arr, sum);

	}

}
