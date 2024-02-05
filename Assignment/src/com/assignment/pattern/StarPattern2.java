package com.assignment.pattern;

public class StarPattern2 {
	public static void pattern2(int rows){
		int i,j;
		
		for(i=rows;i>=1;i--) {
			
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern2(5);

  }
}