package com.throwdemo;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException, ArithmeticException {

		throw new IOException("Inavlid input");
	}
}
