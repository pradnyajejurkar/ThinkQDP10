package com.assignmet.nestedloop;
import java.util.Scanner;

public class Check_krishnmurthi {
		
	public static boolean checkkrishnmurti(int num){
		int sum=0;
		int temp=num;
		
		while(num!=0)
		{
		  int rem=num%10;
			sum=sum+findfact(rem);
			num/=10;
		}
		return (temp==sum);
	     } 
		
		
		public static int findfact(int num){
		int fact=1,i;
		for(i=1;i<=num;i++) {
		  fact=fact*i;
		 
		}
		return fact;
		
	    }
		
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		boolean status=checkkrishnmurti(n);
		if(status)
			System.out.println(n+ " is a krishnamurthi number");
		else
			System.out.println(n+ " is not a krishnamurthi number");
	   }
	}
		


