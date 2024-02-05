package com.assignmet.nestedloop;

import java.util.Scanner;

public class FascinateNum {

	public static boolean isfascinating(int num) {
		int r1=num*2;
		int r2=num*3;
		
		String concatNum=r1+""+r2+num;
		int n=Integer.parseInt(concatNum);
		
		for(int i=1;i<=9;i++) {
			int count=countFrequency(n,i);
			if(count!=1)
				return false;
			}
				return true;
		}
	
	 public static int countFrequency(int num, int i) {
		int count=0;
		while(num!=0) {
			int rem=num%10;
			if(rem==i)
				count++;
			num=num/10;
		}
		  return count;
	}
	
	 public static int countdigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		  return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int digits=countdigit(num);
		if(digits>=3) {
			if(isfascinating(num)) 
			{
				System.out.println(num + " is fascinating number");
			}
			else
			{
				System.out.println(num + " is not a fascinating number");
			}
		
		}		System.out.println(num + " number is less or not equal");
		
	}

}
