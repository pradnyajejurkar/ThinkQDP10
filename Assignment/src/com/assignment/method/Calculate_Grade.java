package com.assignment.method;

import java.util.Scanner;

public class Calculate_Grade {

	public static char calGrade(float sub1,float sub2,float sub3,float sub4) {
		float total,per;
		char grade;
		total=sub1+sub2+sub3+sub4;
		per=(total/400)*100;
		
		if(per>=90)
			grade ='A';
		else if(per>=75)
			grade ='B';
		else if(per>=60)
			grade ='C';
		else if(per>=40)
			grade ='D';
		else
			grade ='E';
		return grade;
	}
	
	public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
           
          float s1,s2,s3,s4;
          System.out.println("Enter the four subject marks:");
          s1=sc.nextFloat();
          s2=sc.nextFloat();
          s3=sc.nextFloat();
          s4=sc.nextFloat();
          
          char grade=calGrade(s1,s2,s3,s4);
          System.out.println("Grade is:"+grade);
          
          
	}

}
