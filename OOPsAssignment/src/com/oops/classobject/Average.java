package com.oops.classobject;
/*8.
Print the average of three numbers entered by user by creating a class 
named 'Average' having a method to calculate and print the average.*/

import java.util.Scanner;

public class Average {

	double num1, num2, num3;
	double avg;

	public void setValue(double num1, double num2, double num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;

	}

	public double calAvg(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3;
		System.out.println("Enter n1:");
		n1 = sc.nextDouble();
		System.out.println("Enter n2:");
		n2 = sc.nextDouble();
		System.out.println("Enter n3:");
		n3 = sc.nextDouble();

		Average a = new Average();
		a.setValue(n1, n2, n3);

		System.out.println("Avg is:" + a.calAvg(n1, n2, n3));

	}

}
