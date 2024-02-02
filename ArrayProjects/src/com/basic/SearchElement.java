package com.basic;

import java.util.Scanner;

public class SearchElement {

	public static void searchElements(int arr[],int n) {
		int indexno=-1;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				indexno=i;
				break;
			}
		}
		if(indexno!=-1) {
			System.out.println("element is present at " +n+" index:"+indexno);
		}
		else {
			System.out.println("element is not present");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {78,85,45,25,77,88,66};
		
		System.out.println("Enter the number to search in array");
		int n=sc.nextInt();
		
		searchElements(arr, n);
	}

}
