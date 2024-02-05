package com.demo.conditionalstatement;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
	
		if(num % 4==0) {
			if( num % 6==0) {
				System.out.println(num+ " number is divisible by 4 and 6");
			}
		    else {
	             System.out.println(num+ " number is  divisble by 4 ");

             }
			}
		else if(num%6==0) {
			System.out.println(num+" number is only divisible by 6 ");
		}
		else {
			System.out.println(num+ " number is not divisible by 4 and 6");
		}
		}
}

	


