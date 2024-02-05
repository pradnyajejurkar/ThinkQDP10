package com.demo.conditionalstatement;

import java.util.Scanner;

public class PrizeTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter nuber to get prize:");
		num=sc.nextInt();
		
		if(num>=1 && num<=3) {
			System.out.println("Congo!! You got Mobile phone");
		}
		else if(num>=4 && num<=6) {
			System.out.println("Congo!! You got laptop");
		}
		else if(num>=7 && num<=10) {
			System.out.println("Congo!! You got Watch");
		}
		else {
			System.out.println("Sorry!!better luck next time");
		}
	}

}
