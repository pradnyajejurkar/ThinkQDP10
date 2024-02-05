package com.demo.print;

import java.util.Scanner;

public class EvenOrOdd {

	
	public  static void isEven(int num) {
		
			if(num%2==0) {
				if(num%6==0) {
			 
					System.out.println(num+" is even and divisible by 6");
				}
				else {
					System.out.println(num+" is even and not divisible by 6");
				}
			}
			else if(num%5==0){
				System.out.println(num+" is odd and divisible by 5");
			}
				else {
					System.out.println(num + "is odd and not divisible by 5");
			}	
		}
			

		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n; 
		System.out.println("Enetr number:");
		n=sc.nextInt();
		
       isEven(n);
	}

}
