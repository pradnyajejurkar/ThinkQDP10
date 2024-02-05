package com.demo.forloop;
//WAP to print factors of any no
import java.util.Scanner;

public class Print_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i,num,count=0;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			if(num%i==0) 
			{
				count++;
				System.out.println(i);
			}
		}
			System.out.println("count is:"+count);
			
	}
}


