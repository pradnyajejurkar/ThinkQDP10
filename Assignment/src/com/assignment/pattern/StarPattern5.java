package com.assignment.pattern;

public class StarPattern5 {

	
	public static void printPattern1(int rows) {
		int i,j,k;
		
		for(i=1;i<=rows;i++) {
			for(k=rows-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
			//System.out.print("*");
				System.out.print("* ");
			}
		    System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			printPattern1(5);
	}

}
