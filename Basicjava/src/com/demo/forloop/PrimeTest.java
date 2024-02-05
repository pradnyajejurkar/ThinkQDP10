package com.demo.forloop;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,i,count=0;
		
		System.out.println("Enter Number:");
		num=sc.nextInt();
		//101
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}//end loop
		
		if(count==0) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}

	}

}
