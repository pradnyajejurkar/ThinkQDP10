package com.oops.classobject;

public class HarshadNumber {
	int num;

	public HarshadNumber() {

	}

	public HarshadNumber(int num) {
		this.num = num;

	}

	public boolean checkHarshadNum() {
		int temp=num, sum = 0;
		
		while (temp != 0) {
			int rem = temp % 10;
			sum = sum + (temp % 10);
			temp/= 10;
		}
		return (num % sum == 0);

	}
}
