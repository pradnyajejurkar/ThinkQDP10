package com.demo.method;

public class TestArmStrongNo {

	public static boolean findArmstrong(int num) {
		int rem,sum=0;
		int original=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(original==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
	
		int num=371;
		
		boolean test=findArmstrong(num);
		
		if(test) {
			System.out.println(num+" is an armstrong number");
		}
		else {
			System.out.println(num+" is not an armstrong number");

		}

	}

}