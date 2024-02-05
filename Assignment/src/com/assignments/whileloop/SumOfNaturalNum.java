package com.assignments.whileloop;

import java.util.Scanner;

/*write ajava program to show sum of natural numbers
		using the while loop*/
public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		    int n=10, sum = 0, i = 1;
            while (i <= n) 
            {
   
            	sum = sum + i;
					  i++;
				
            }
            	System.out.println("Sum of natural numbers is:"+ " " + sum);
			}
		}


	


