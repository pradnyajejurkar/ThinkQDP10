package com.assignmet.nestedloop;

import java.util.Scanner;

public class DivisiblityTest1Way {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		
		checkfactor();
	}
	public static void checkfactor() {
	 int num=1;
	 char ch;
	 do {
			System.out.println("enter number:");
			num=sc.nextInt();
			if(12%num==0 && 15%num==0)
			System.out.println("i am comfortable in both loop and if");
	
			else if(15%num==0)
			System.out.println("i am comfortable in if");
	
			else if(12%num==0 )
			System.out.println("i am comfortable in loop ");
			else
			System.out.println("invalid input");
			System.out.println("if you want to continue then press y or to stop press any char");
			ch=sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
			System.out.println("-----------End---------");
		}
	}		
	