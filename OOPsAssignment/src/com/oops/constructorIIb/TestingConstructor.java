package com.oops.constructorIIb;

public class TestingConstructor {
	
	public void TestingContructor() {
		System.out.println("Amsterdam");
	}
	
	public TestingConstructor() {
		System.out.println("Antartica");
	}

	public static void main(String[] args) {
		
		TestingConstructor tc=new TestingConstructor();
		tc.TestingContructor();
	}

}
