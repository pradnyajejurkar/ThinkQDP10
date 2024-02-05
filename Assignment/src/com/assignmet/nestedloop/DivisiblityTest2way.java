package com.assignmet.nestedloop;

import java.util.Scanner;

public class DivisiblityTest2way {

	public static boolean checkDivisibility(int a, int b) {
			return a % b == 0;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		char ch;
		do {
			System.out.println("Enter  to check :");
			num = sc.nextInt();
			if (num <= 15) {
				if (checkDivisibility(12, num) && checkDivisibility(15, num)) {
					System.out.println("confortable in loop and if");
				} 
				else if (!(checkDivisibility(12, num)) && !(checkDivisibility(15, num))) {
					System.out.println("no msg");
				} else {
					if (checkDivisibility(15, num)) {
						System.out.println("confortable in if");
					} else if (checkDivisibility(12, num)) {
						System.out.println("confortable in loop");
					}
				}
			} else {
				System.out.println("invalid number");
			}

			System.out.println("do u want to continue if yes enter y:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
