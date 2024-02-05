package com.assignmet.nestedloop;


public class ArmstrongNum {

	public static int power(int base,int pow) {
		int i,ans=1;
		for(i=1;i<=pow;i++) {
			ans=ans*base;
		}
		return ans;
	}
	
	public static int countdigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
		}
	
	public static boolean checkArmstrong(int num) {
		int sum=0,rem;
		int temp=num;
		int pow=countdigit(num);
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem,pow);
			num/=10;
		}
		if(sum==temp)
			return true;
		else
			return false;
		}
	public static void printArmstrong(int range) {
		int i;
		
		for(i=1;i<=range;i++) {
			boolean test=checkArmstrong(i);
			if(test)
				System.out.println(i);
	     	}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArmstrong(5000);

	}

}
