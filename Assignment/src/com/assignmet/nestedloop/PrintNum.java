package com.assignmet.nestedloop;

public class PrintNum {

	
	public static void checkDivisible(int n) {
		int i;
		for(i=1;i<=20;i++) {
			if(i%3==0) {
				continue;
			}
		
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=20;
        checkDivisible(num);

	}

}
