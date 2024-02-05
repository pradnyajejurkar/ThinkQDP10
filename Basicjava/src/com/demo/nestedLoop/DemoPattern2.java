package com.demo.nestedLoop;

public class DemoPattern2 {

	public static void pattern2(int rows) {
		int i,j;
		
		for(i=rows;i>=1;i--) {
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern3(int rows) {
		int i,j;
		
		for(i=1;i<=rows;i++) {
			for(j=rows;j>=i;j--) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern2(5);
		
		pattern3(4);

	}

}