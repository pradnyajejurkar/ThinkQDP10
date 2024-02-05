package com.demo.nestedLoop;

public class PrintPattern1 {

	public static void printPattrn(int rows) {
	int i,j,k;
	
	for(i=1;i<=rows;i++) {
		for(k=1;k<i;k++) {
			System.out.print(" ");
		}
		for(j=rows;j>=i;j--) {
			System.out.print("* ");
			//System.out.print("*");
		}
		
		System.out.println();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattrn(5);
	}

}
