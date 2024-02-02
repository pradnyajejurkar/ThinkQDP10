package com.oops.classobject;

import java.util.Scanner;

public class ArnstrongTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		ArmstrongNum a1=new ArmstrongNum(num);
		if(a1.checkArmstrong()) 
			System.out.println(a1.num+ " is a Armstrong number");
		else
			System.out.println(a1.num+ " is not Armstrong number");
			
			
		}
		
		
	}


