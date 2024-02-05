package com.assignment.method;

import java.util.Scanner;

public class IsbnNum {
	
	public static void main(String args[])
	    {
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        int num = sc.nextInt();
	        
	        checkNumber(num);
	    }

	    
	    public static void checkNumber(int num)
	    {
	    	int count=0,temp=num,sum=0,rem;
	        
	        while(temp>0)
	        {
	            rem=temp%10;
	            temp/=10;
	            sum+=rem*++count;
	        }

	        if(sum%11==0)
	        {
	            System.out.println(num+" is an ISBN number");
	        }
	        else
	        {
	            System.out.println(num+" is Not an ISBN number");
	        }
	    }
	}


