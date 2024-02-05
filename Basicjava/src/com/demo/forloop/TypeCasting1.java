package com.demo.forloop;

import java.util.Scanner;

public class TypeCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       int num;
       
       System.out.println("Enter the number:");
       num=sc.nextInt();
       
       //char ch=(char)num;
       System.out.println(num + " " +(char)num);
	}

}
