package com.demo.forloop;
//Print table of any number 
import java.util.Scanner;

public class Print_TableOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num,i;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		if(num>0) {
		System.out.println("Table of "+num);
		for(i=1;i<=10;i++) {
			 System.out.println(num+" * "+i+"="+(num*i));
		}
		
		}else {
			System.out.println("Invalid choice");
			
		}
		}
	}


