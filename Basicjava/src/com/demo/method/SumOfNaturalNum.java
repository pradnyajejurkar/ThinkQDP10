package com.demo.method;

public class SumOfNaturalNum {
	//void
	static int i;
	static int sum=0;
	public static void calSum(int n) {
		
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum is:" +sum);
		
	}
	//or
	//int
	public static int calSum1(int n) {
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		//calSum(num);
		//or
		int sum=calSum1(num);
		System.out.println(sum);
		
		
	}

}
