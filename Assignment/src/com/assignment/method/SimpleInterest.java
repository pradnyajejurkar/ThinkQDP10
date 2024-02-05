package com.assignment.method;

import java.util.Scanner;

public class SimpleInterest {

	 public static void calculateSimpleInterest(float x, float y, float z) {
	        float si; 
            si = (x * y * z) / 100;
           System.out.println("Simple Interest = " + si); 
	 }
	        public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the principal (amount), time, and rate:");

	        float p = sc.nextFloat(); 
	        float t = sc.nextFloat(); 
	        float r = sc.nextFloat(); 

	        calculateSimpleInterest(p, t, r);
	    }
	}