package com.basic.assignments;

public class SearchElement {

	static boolean searchElement(int arr[],int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) 
				return true;
			}
			return false;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {6,4,5,7,6,4,1,0};
		
		if(searchElement(arr, 6)) {
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}
