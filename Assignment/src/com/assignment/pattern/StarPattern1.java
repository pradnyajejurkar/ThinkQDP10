package com.assignment.pattern;

public class StarPattern1 {

	public static void pattern1(int rows) {
		int i,j;
		
		for(i=1;i<=rows;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}//inner loop ends
			System.out.println();
		}//outer loop ends
	}//method ends
	public static void main(String[] args) {
		
		pattern1(5);
	}

}
