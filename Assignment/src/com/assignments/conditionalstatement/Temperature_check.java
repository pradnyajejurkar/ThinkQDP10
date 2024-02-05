package com.assignments.conditionalstatement;
/*Write a C program to read temperature in centigrade and display a suitable message according to the temperature state below:
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot*/

import java.util.Scanner;

public class Temperature_check {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			
			int temp;
			System.out.println("Enter the temprature:");
			temp=sc.nextInt();
			
			if(temp <0) {
				System.out.println("Freezing Weather");
			}
			else if(temp <10) {
				System.out.println("Very Cold Weather ");
			}
			else if(temp <20) {
				System.out.println("Cold Weather");
			}
			else if(temp <30) {
				System.out.println("Normal in temperature");
	
			}
			else if(temp <40) {
				System.out.println("Its Hot");
			}
			else if(temp >=40) {
				System.out.println("Its very Hot");
			}

	}

}
