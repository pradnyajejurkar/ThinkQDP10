package com.oops.classobject;

//8)Write java Program for arithmetic operation for each operation write separate Method
public class ArthmeticOp {
	int a = 10, b = 20, ans;

	public void add() {
		ans = a + b;
		System.out.println("Addition is:" + ans);
	}

	public void sub() {
		ans = a - b;
		System.out.println("Subtraction:" + ans);
		
	}

	public void mul() {
		ans = a * b;
		System.out.println("Multiplication is:" + ans);
	}

	public void div() {
		ans = a / b;
		System.out.println("Division is:" + ans);
	}

	public void mod() {
		ans = a % b;
		System.out.println("Modulus is:" + ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArthmeticOp a1 = new ArthmeticOp();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
	}

}
