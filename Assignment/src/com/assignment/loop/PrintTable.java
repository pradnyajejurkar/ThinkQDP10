package com.assignment.loop;

import java.util.Scanner;

public class PrintTable {

	public static void printTable(int num) {
		
		int i;
		for(i=1;i<=10;i++) {
		     
				System.out.println(num+ "*"+i+"=" +(num*i));
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number:" );
		n=sc.nextInt();
		 
		printTable(n);

	}

}
