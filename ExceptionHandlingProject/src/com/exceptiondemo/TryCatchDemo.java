package com.exceptiondemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			
		int[] n=new int[5];
		
		n[5]=30/0;
		
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block executed");
		}
		System.out.println("rest code");
		}
	}


