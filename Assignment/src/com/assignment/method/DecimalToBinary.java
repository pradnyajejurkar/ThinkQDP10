package com.assignment.method;

import java.util.Scanner;

public class DecimalToBinary {
	
	
	public static String decimalToBinary(int num)
	{
		String str="";
		while(num>0) {
			str=(num%2)+str;
			num/=2;
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the decimal number:");
		int dnum=sc.nextInt();
		
		String s=decimalToBinary(dnum);
		System.out.println("Binary number:"+s);
		
	}

}
