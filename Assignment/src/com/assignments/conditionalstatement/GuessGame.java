package com.assignments.conditionalstatement;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     
     int num=20,guess,count=0;
     for(;;) {
     System.out.println("enter the number:");
     guess=sc.nextInt();
     count++;
     if(num==guess) {
    	 System.out.println("Congratulations!! you have guessed right number");
    	 System.out.println("count is:" +count);
    	 break;
     }
     else if(guess<num){
    	 System.out.println("number is less please enter higher number");
    	 System.out.println("count is:" +count);
     }else if(guess>num) {
    	 System.out.println("number is greater please enter lower number");
    	 System.out.println("count is:" +count);
     }
   }
      
 }
}

