package com.demo.method;

public class Test_method2 {

	
	
		//method with return keyword and without parameter
		
		public static String display() {
			return "hello";
		}
		
		public static int sendAge() {
			int a=10;
			return a;
		}
		
		//method with return,with parameter
		public static int add(int a,int b) {
			//return a+b;
			int sum=a+b;
			return sum;
		}
		public static void main(String[] args) {
		
			System.out.println("main()");
			String s=display();
			System.out.println(s);
			
			int age=sendAge(); //method with return keyword and without parameter
			System.out.println(age);
			
			System.out.println(sendAge());
			
			double age1=sendAge(); //implicit typecasting
			
			short age2=(short)sendAge(); //explicit typecasting
			
			int sum=add(10,2);  ////method with return,with parameter
			System.out.println(sum);
		}
		
		
		}

