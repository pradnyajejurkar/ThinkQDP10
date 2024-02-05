package com.assignments.method;

import java.util.Scanner;

public class LargestAndSmallestCount {
	
	
		static Scanner sc=new Scanner(System.in);
		
		public static void countNum() {
				
			int num;
			char ch;
			
			int largestNum=0,smallestNum=0;
			do {
				System.out.println("Enter the number:");
				num=sc.nextInt();
				if(num>0) {
					System.out.println(num+ " number is largest");
					largestNum++;
				}else { 
					System.out.println(num+ " number is smallest");
					smallestNum++;
				}
				System.out.println("Do you want to continue? if yes then enter y or stop enter any char");
				ch=sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
			System.out.println("Largest number count:" +largestNum);
			System.out.println("Smallest number count:" +smallestNum);
			
		}

		public static void main(String[] args) {
			countNum();
		}
	}		

