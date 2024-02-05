package com.assignment.loop;
//15.s=1!+2!+3!.........+n! find s
import java.util.Scanner;

public class sumOfFact {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	int num,fact=1,sum=0;
			System.out.println("enter the number");
			num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
	            sum=sum+fact;
			}
			System.out.println("sum is:" +sum);

	      }
}
		

		
