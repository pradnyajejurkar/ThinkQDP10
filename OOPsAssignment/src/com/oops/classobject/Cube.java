package com.oops.classobject;

import java.util.Scanner;

/*12) write a java program to calculate cube for given number using no return type ,with return type,
with parameter passing, with parameter and return type*/
public class Cube {

	int cube, num;

	public void cube() {
		cube = num * num * num;
		System.out.println("cube is:" + cube);// no return type
	}

	public int cube1() {
		cube = num * num * num;
		return cube;// with return type
	}

	public void cube2(int num) {
		cube = num * num * num;
		System.out.println("cube is:" + cube);//with parameter passing
	}

	public int cube3(int num) {
		cube = num * num * num;
		return cube;// with parameter and return type
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter number:");
		n=sc.nextInt();
		
		Cube c1=new Cube();
		int cube=c1.cube3(n);
		c1.cube();
		c1.cube1();
		c1.cube2(n);
		
		
		System.out.println("Cube is:"+cube);
	}
}


