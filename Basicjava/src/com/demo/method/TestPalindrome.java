package com.demo.method;

public class TestPalindrome {


	public static int findReverse(int num) {
		int rev=0,rem;
		while(num!=0) {
			//rem=num%10;
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	
//	public static boolean findPalindrome(int num) {
//		int rev=0,rem;
//		int original=num;
//		while(num!=0) {
//			//rem=num%10;
//			rev=rev*10+num%10;
//			num/=10;
//		}
//		if(original==rev)
//			return true;
//		else
//			return false;
//	}
	
	public static boolean findPalindrome(int num) {
		int rev=findReverse(num);
		if(rev==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=122;
		
		if(num==findReverse(num)) {
			System.out.println(num+" is palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
		
		boolean status=findPalindrome(num);
		if(status) {
			System.out.println(num+" is palindrome");
		}
		else {
			System.out.println(num+" is not a palindrome");
		}
	}

}

