package com.exceptiondemo;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int arr[]=new int[3];
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter a number:");
				arr[i]=sc.nextInt();
			}
			System.out.println("--------------");
			for(int i=0;i<arr.length;i++) {
				System.out.println("ans:"+(100/arr[i]));
			}
		}
		
		
		//rest code become unreachable
//		catch(Exception e) {
//			System.out.println(e);
//		}

		//or combine exception using or(|)
//		catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
//			System.out.println(e+ ": check the code");
//		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+ ": Index is greater");
		}
		catch(ArithmeticException e) {
			System.out.println(e+ ": array element cannot be zero");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			 sc.close();
			 System.out.println("in finally block");
		}
		System.out.println("rest code");

	}
}
