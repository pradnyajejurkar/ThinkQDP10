package com.assignments.whileloop;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=10,guessNum=0;
		
		while(guessNum!=num) {
			System.out.println("Enter the number :");
			guessNum=sc.nextInt();
			
			if(guessNum==num) {
				break;
			}
			else if(guessNum<num) {
				System.out.println("Too Low!..please guess higher number");
			}else if(guessNum>num) {
				System.out.println("Too High!..please guess lower number");
			}
		 }
		     System.out.println("You have guessed the right number!");
		}

	}


