package com.demo.print;

import java.util.Scanner;

public class check_krishnmurthy {

  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  int num,sum=0,fact=1,temp=1;
	  
	  System.out.print("Enter the number : ");
      num=sc.nextInt();
     
      while(num!=0)
	  {
	     fact=fact*num;
	     num--;
	  }
      while(temp!=0) 
      {
	     sum=sum+fact*(temp%10);
	     temp=temp/10;
	  
	  }
	  if(sum==num)
	    System.out.print(num+" is a krishnamurthy number");
	  else
	    System.out.print(num+" is Not a krishnamurthy number");
	  }
	}