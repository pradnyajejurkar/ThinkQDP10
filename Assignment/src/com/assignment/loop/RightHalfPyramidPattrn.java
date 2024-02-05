package com.assignment.loop;

import java.util.Scanner;

public class RightHalfPyramidPattrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		       int i,j,n;
		       System.out.println("enter the number:" );
		       n=sc.nextInt();
		        
		      for(i=1;i<=n;i++) {
		    	  
		      for(j=1;j<=i;j++) 
		      {
		        System.out.print("*");
		      }
		        System.out.println();
		        }
		    }
	}


