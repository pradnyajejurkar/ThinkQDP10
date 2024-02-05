 package com.demo.method;

public class EvenOddTest {

	
	    //void
		public static void testEven(int num) {
			if(num%2==0) {
				System.out.println(num+" is even");
			}
			else {
				System.out.println(num+" is odd");
			}
		}
		//without void
		public static boolean testEvenAndOdd(int num) {
			return num%2==0;
		}
		
		public static int testEvenorOdd(int num) {
		  return num%2;
		}
		public static void main(String[] args) {
			
			int n=13;
			testEven(n);
			
			boolean status=testEvenAndOdd(n);
			if(status)
				System.out.println(n+" is even");
			else
			    System.out.println(n+" is odd");
		
			int ans=testEvenorOdd(n);
			if(ans==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}

	}


