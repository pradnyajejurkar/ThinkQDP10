package com.Arrays;

public class FindDuplicate {

	static void findDuplicateNum(int arr[]) {
		int count;
		boolean status;
		int k;
		for(int i=0;i<arr.length;i++) {
			count=1;
			status=false;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
				status=true;
				break;
			}
		}
	
		if(status==false) {
			
			for(k=i+1;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
					count++;
					arr[k]=0;
				}
			}
		}
		
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.println(arr[i]);
			
		}
	}
		
	}
	public static void main(String[] args) {
	int arr[]= {2,3,2,3,5,6,4,7};
	findDuplicateNum(arr);
	}

}
