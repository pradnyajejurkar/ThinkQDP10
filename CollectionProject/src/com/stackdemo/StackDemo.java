package com.stackdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.push("Pradnya");
		stk.push("Neha");
		stk.push("Mayuri");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		System.out.println(stk);
		
		System.out.println(stk.pop());
		System.out.println(stk);
		
		System.out.println(stk.search("Neha"));
		System.out.println(stk.search("neeta"));
		
		
	}

}
