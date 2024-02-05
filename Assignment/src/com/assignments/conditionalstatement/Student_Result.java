package com.assignments.conditionalstatement;
/* Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/

import java.util.Scanner;

public class Student_Result {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
       int Phy,Chem,Bio,Math,Comp,total;
       float percentage;
       
       System.out.println("Enter the five subjects marks: ");
       Phy=sc.nextInt();
       Chem=sc.nextInt();
       Bio=sc.nextInt();
       Math=sc.nextInt();
       Comp=sc.nextInt();
       
       total=Phy+Chem+Bio+Math+Comp;
       percentage=(total/5);
       
       System.out.println("total is : " +total);
       System.out.println("percentage is : " +percentage);
       
       if(percentage >=90 ) {
    	 
    	   System.out.println("Grade A");
       }
       else if(percentage >=80) {
    	   	
    	   System.out.println("Grade B");
       }
       else if(percentage >=70) {
    	   	
    	   System.out.println("Grade C");
       }
       else if(percentage >=60) {
    	   	
    	   System.out.println("Grade D");
       }
       else if(percentage >=40) {
    	   	
    	   System.out.println("Grade E");
       }
       else {
       
    	   System.out.println("Grade F");
       }
       
    	   
     }
    	   
 }
	


