package com.assignment.loop;

import java.util.Scanner;

public class PalindormeOrNot {

     public static void main(String args[]){  
    	 Scanner sc=new Scanner(System.in);
		  int num=0,rem,sum=0,temp; 
		  System.out.println("Enter number");
		  num=sc.nextInt();
		  
		  temp=num;    
		  while(num>0)
		  {    
		   rem=num%10;   
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }    
		  if(temp==sum){ 
		   System.out.println("palindrome number ");    
		  }else {    
		   System.out.println("not palindrome");    
		}  
     }	}  