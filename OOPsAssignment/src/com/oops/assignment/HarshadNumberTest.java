package com.oops.assignment;

import java.util.Scanner;

public class HarshadNumberTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		HarshadNumber h1=new HarshadNumber(num);
		
		if(h1.checkHarshadNum()) {
			System.out.println(h1.num+ " is a Harsahd Number");
		}else {
			System.out.println(h1.num+ " is not Harsahd Number");
		}
			
	
	}

}
