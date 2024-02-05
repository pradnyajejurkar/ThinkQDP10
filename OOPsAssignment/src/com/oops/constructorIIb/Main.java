package com.oops.constructorIIb;

class T{
	int t=20;
	
	public T() {
		t=40;
	}
}


public class Main {

	public static void main(String[] args) {
		T t1=new T();
		System.out.println("t1.t");
		//o/p-t1.t
	}

}
