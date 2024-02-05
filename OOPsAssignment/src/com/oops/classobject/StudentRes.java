package com.oops.classobject;
/*7) Create class student and write a meaningful program with 3 methods (1 with return type 
(calculating percentage), 1 without return
type (displaying student data), 1 with parameter list).*/

import java.util.Scanner;

public class StudentRes {
	double m1, m2, m3;
	double total,per;

	public void setMarks(double m1,double m2,double m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public double calPer(double m1,double m2,double m3) {
		 total=m1+m2+m3;
		 per=(total/300)*100;
		return per;
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m1,m2,m3;
		System.out.println("Enter marks of m1:");
		m1 = sc.nextDouble();
		System.out.println("Enter marks of m2:");
		m2 = sc.nextDouble();
		System.out.println("Enter marks of m3:");
		m3 = sc.nextDouble();
		
		
		StudentRes sr1 = new StudentRes();
		sr1.setMarks(m1,m2,m3);

		
		System.out.println("Percentage is:" +sr1.calPer(m1, m2, m3));

	}

}
