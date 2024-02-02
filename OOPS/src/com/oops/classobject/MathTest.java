package com.oops.classobject;

class MathDemo{
	public int findSqr(int n) {
		return n*n;
	}
	
	public int findCube(int n) {
		return n*n*n;
	}
}

public class MathTest {

	public static void main(String[] args) {
		
		MathDemo m1=new MathDemo();
		int square=m1.findSqr(2);
		int cube=m1.findCube(3);
		
		System.out.println("Square is:"+square);
		System.out.println("Cube is:"+cube);
	}

}
