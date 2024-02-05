package com.assignment.method;

import java.util.Scanner;

public class Arithmetic_Operators {
	
	public static int Sum(int x, int y) {
        return x + y;//addition
    }
	
	public static int Sub(int x, int y) {
        return x - y;//Subtraction
    }

     public static int Mul(int x, int y) {
        return x * y;//multiplication
    }

    public static float Div(int x, int y) {
        return x / y;//division
    }

    public static int Mod(int x, int y) {
        return x % y;//modulus
    }
    
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two numbers:");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();

        System.out.println("Addition is :" + num1 + " + " + num2 + " = " + Sum(num1, num2));
        System.out.println("Subtraction is:" + num1 + " - " + num2 + " = " + Sub(num1, num2));
        System.out.println("Multiplication is:" + num1 + " * " + num2 + " = " + Mul(num1, num2));
        System.out.println("Division is:" + num1 + " / " + num2 + " = " + Div(num1, num2));
        System.out.println("Modulus is:" + num1 + " % " + num2 + " = " + Mod(num1, num2));
     }
}