package com.varags;

public class RulesOfVarags {

	//Rule1: we can have only 1 varags
	
//	static void display(int ...a,String ...s) {
//		
//	}
	
	
	//Rule 2: last argument in the method
	
//	static void method(int n1,int ...a,int n2) {
//		
//	}
	
	static void method(int n1,int n2,int ...a) {
		System.out.println(n1);
		System.out.println(n2);
		for(int x:a) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
     //display(12,3,"Pooja","Ritu");
		
		method(2,4,5,6,7,8);
		
	}

}
