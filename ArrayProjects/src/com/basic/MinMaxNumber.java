package com.basic;

public class MinMaxNumber {

	public static void findMinMax(int arr[]) {
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
		}
	     if(arr[i]<min) {
			min=arr[i];
	   }
     }
		System.out.println("maximum number:"+max);
		System.out.println("mininum number:"+min);
}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		findMinMax(arr);

	}

}
