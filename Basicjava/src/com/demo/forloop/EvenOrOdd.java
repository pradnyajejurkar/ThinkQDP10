package com.demo.forloop;
//WAP to print 1 to 50 numbers
//WAP to print even no from 1 to 50
//WAP to print which no is even or odd from 1 to 50
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for(i=1;i<=50;i++) {
			//System.out.println(i);
			if(i%2==0) {
		        System.out.println(i+" is even number");
			}
			else {
				System.out.println(i+" is odd number");
			}
		}
	}

}
