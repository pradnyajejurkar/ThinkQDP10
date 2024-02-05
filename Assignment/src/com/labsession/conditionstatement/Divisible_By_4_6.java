package com.labsession.conditionstatement;
import java.util.*;
public class Divisible_By_4_6 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int num,rem,quotient;
			System.out.println("Enter num:");
			num=sc.nextInt();
			
			if(num%4==0 && num%6==0) {
				System.out.println(num+" is divisible by 4 and 6");
			}
			else {
				System.out.println(num+" is not divisible by 4 and 6");
			}
		}

	
	}


