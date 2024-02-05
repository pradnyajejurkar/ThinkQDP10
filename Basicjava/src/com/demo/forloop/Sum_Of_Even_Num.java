package com.demo.forloop;

public class Sum_Of_Even_Num {

	public static void main(String[] args) {
		
		int i,sum=0;
		//System.out.println("enter number");
		for(i=1;i<=20;i++) 
	    {
		  if(i%2==0) 
		  {
			sum=sum+i;
		  }
	    }
		 System.out.println("The sum of even numbers:" +sum);
		}

	}


