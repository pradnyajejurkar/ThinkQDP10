package com.basic;

public class ConstructorChaining {

	int id;
	String name;
	
	ConstructorChaining(){
		this(10,"abc");
		System.out.println("this is default constructor");
	}
	
	ConstructorChaining(int id,String name){
		//this();
		System.out.println("this parametrize constructor");
		 this.id=id;
		 this.name=name;
	}
	
	
	public static void main(String[] args) {
		ConstructorChaining c1=new ConstructorChaining();

	}

}
