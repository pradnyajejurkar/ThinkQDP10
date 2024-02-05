package com.assignment.switchcase;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
		int option;
		
		
		System.out.println("MENU:");
        System.out.println("1.Area of a Circle");
        System.out.println("2.Area of a Square");
        System.out.println("3.Area of a Right Angled Triangle");
        System.out.println("4.Area of a Rectangle");
        System.out.println("5.Circumference of a Circle");
        System.out.println("6.Perimeter of a Square");
        

        System.out.println("Enter your option:");
        option=sc.nextInt();

        switch(option) {
        case 1: 
        	System.out.println("Enter radius of circle :");
                 float r=sc.nextFloat();
                 float ac=3.14f*r*r;
                 System.out.println("Area of circle:" +ac);
                 break;

        case 2: 
        	System.out.println("Enter side of square:");
                  int x=sc.nextInt();
                  int as=x*x;
                  System.out.println("Area of square:" +as);
                  break;

        case 3: 
    	   System.out.println("Enter height and base of right angle triangle:");
                  float h=sc.nextFloat();
                  float bs=sc.nextFloat();
                  float art=0.5f*h*bs;
                  System.out.println("Area of right angle triangle :"+art);
                  break;

        case 4: 
        	System.out.println("Enter length and breadth of rectangle:");
                   int l=sc.nextInt();
                   int b=sc.nextInt();
                   int ar=l*b;
                   System.out.println("Area of rectangle:"+ar);
                   break;

        case 5: 
        	System.out.println("Enter radius:");
                   float R=sc.nextFloat();
                   float C=3.14f*2f*R;
                   System.out.println("Circumference of circle:"+C);
                   break;


        case 6: 
        	System.out.println("Enter side:");
                    int X=sc.nextInt();
                    int p=4*X;
                    System.out.println("Perimeter of a square:"+p);
                    break;

             default:
            	 System.out.println("Exit");
            }
         }

	}


