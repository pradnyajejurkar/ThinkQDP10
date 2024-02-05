package com.varags;

public class VaragsDemo {

	//ellipsis (...)
	static void findSum(int ...ar) {
		int sum=0;
		for(int x:ar){
			sum+=x;
			
		}
		System.out.println("Sum is:"+sum);
	}
	public static void main(String[] args) {
		findSum(1,2,3);
		findSum(1,2,3,4,5);
		findSum(1,2);
	}

}
