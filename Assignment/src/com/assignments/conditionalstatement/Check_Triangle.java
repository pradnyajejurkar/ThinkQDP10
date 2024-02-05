package com.assignments.conditionalstatement;
/*Write a Java program Check whether the triangle is equilateral, scalene, or isosceles
Before writing the program, we should know the properties of isosceles, equilateral, and scalene triangles.
Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length.
Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal.
Scalene triangle: A scalene triangle is a triangle that has three unequal sides.*/
import java.util.Scanner;

public class Check_Triangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int a,b,c;
		
		System.out.println("Enter the Value of a,b and c :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a == b && b == c){
				
			System.out.println("Equilateral Triangle");
		}
		else if(a == b || b == c || c == a) {
			
				System.out.println("Isosceles Triangle");
		}
		else {
			
				System.out.println("Scalene Triangle");
		}
	}

}
