package com.exceptiondemo;

public class TryFinally {

	public static void main(String[] args) {
		try 
		{
			int a=10;
			System.out.println(a/0);
		}
//		catch(Exception e) {
//			
//		}
		
		finally
		{
			System.out.println("done...");
		}
		
		System.out.println("rest code");
		//catch - auto generated by JVM- abruptly stop
	}

}
