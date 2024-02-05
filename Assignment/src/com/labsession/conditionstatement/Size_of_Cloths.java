package com.labsession.conditionstatement;

import java.util.Scanner;

public class Size_of_Cloths {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size;
		
		System.out.println("Enter the size of T-shirt:");
		size=sc.nextInt();
		
		if((size>=30) &&(size<=34))
		{
			System.out.println("T-shirt size is small");
		
		}
		else if((size>=35) && (size<=38)) 
		{
			System.out.println("T-shirt size is medium");
		}
		else if((size>=39) && (size<=41)) 
		{
			System.out.println("T-shirt size is large");
		}
		
		else if((size>=42) && (size<=44)) 
		{
			System.out.println("T-shirt size is extra large");
		}
		else {
			System.out.println("Invalid size");
		}

	}
}

