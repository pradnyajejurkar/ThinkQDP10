package com.demo.method;

import java.util.Scanner;

public class TestFinalArmStrongNum {

	public static int power(int base,int pow) {
		int i;
		int ans=1;
		
		for(i=1;i<=pow;i++) {
			ans=ans*base;
		}
		return ans;
	}
	
	public static int countDigitsOfNum(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static boolean checkArmstrong(int num) {
		//371
		int sum=0,rem;
		int original=num;
		int pow=countDigitsOfNum(num);//3
		//371!=0
		//37!=0
		//3!=0
		while(num!=0) {
			rem=num%10;// 1  7  3 
			sum=sum+power(rem,pow); //1 344  27+344   371
			num/=10; //37   3  0
		}
		
		if(sum==original)
			return true;
		return false;
	}
	public static void main(String[] args) {
//		
//		int base=3;
//		int pow=2;
//		System.out.println(power(base,pow));
//		System.out.println(countDigitsOfNum(56));
		
		int num=8208;
		
		boolean status=checkArmstrong(num);
		if(status)
			System.out.println(num+" is an amstrong number");
		else
			System.out.println(num+" is not an amstrong number");

	}

}