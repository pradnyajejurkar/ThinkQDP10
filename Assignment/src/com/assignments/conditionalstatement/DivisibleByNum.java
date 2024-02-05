package com.assignments.conditionalstatement;
import java.util.Scanner;
public class DivisibleByNum {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
	
		if(num % 5==0) {
			if( num % 5==0) {
				System.out.println(num+ " number is divisible by 5 and 11");
			}
		    else {
	             System.out.println(num+ " number is  divisble by 5 ");

             }
			}
		else if(num%11==0) {
			System.out.println(num+" number is only divisible by 11 ");
		}
		else {
			System.out.println(num+ " number is not divisible by 5 and 11");
		}
		}
}