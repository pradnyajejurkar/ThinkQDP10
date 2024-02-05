package com.assignmet.nestedloop;

public class FibonaciSeries {
	
	public static void fibonaciSeries() {
		int i, n1=0,n2=1;
		System.out.println(n1);
		
		for(i=2;i<=10;i++) {
			
			int n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonaciSeries();

	}

}
