package com.assignments.whileloop;

import java.util.Scanner;

public class Reverse_Num {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			int num,rev=0,rem;
			
			System.out.println("Enter the number:");
			num=sc.nextInt();
			
			while(num!=0) {
				
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			
			System.out.println("Reverse is:" +rev);
		}

}





