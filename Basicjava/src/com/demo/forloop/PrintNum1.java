package com.demo.forloop;

import java.util.Scanner;

public class PrintNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i,num;
		
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			System.out.println(i);
			
		}

	}

}
