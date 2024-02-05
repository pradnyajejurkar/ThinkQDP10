package com.assignment.method;
import java.util.Scanner;
public class FindAreaTest {
//WAP to take l,b from user and cal area of rect using method approach
	
    public static void AreaOfRect(double l,double b) {
    double area=l*b;
	System.out.println("Area:"+area);
	}
	public static void main(String[] args) {

	//case 1
	AreaOfRect(10, 3);
			
	//case 2
	Scanner sc=new Scanner(System.in);
	double len,br;
	System.out.println("Enter length of rectangle:");
	len=sc.nextDouble();
	System.out.println("Enter breadth of rectanngle:");
	br=sc.nextDouble();
    AreaOfRect(len, br);
		}

	}


		

	


