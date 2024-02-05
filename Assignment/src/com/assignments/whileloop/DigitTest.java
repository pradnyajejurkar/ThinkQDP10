package com.assignments.whileloop;

import java.util.Scanner;

public class DigitTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int num,rem;
         System.out.println("Enter number:");
         num=sc.nextInt();
         
         while(num!=0) {
        	 rem=num%10;//rem
        	 num=num/10;//quotient
        	 System.out.println(rem+ " next num:"+num);
         }
	
	}

}
