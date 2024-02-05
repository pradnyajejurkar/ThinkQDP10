package com.demo.forloop;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i,num,exponent;
		long power=1;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		System.out.println("Enetr the exponent value:");
		exponent=sc.nextInt();
		
		for(i=1;i<=exponent;i++) {
			power=power * num;
		}
		System.out.println("The power of no is:" +power);
			
		}
		
	}

