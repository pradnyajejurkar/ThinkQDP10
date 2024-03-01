package com.stackdemo;

class MyStack{
	
	int top;
	int size;
	int stk[];
	
	public MyStack() {
		this(10);
	}
	
	public MyStack(int size) {
		this.size=size;
		top=-1;
		stk=new int[this.size];
	}
	
	boolean push(int data) {
		if(top<size-1) {
			top++;
			stk[top]=data;
			return true;
		}
		else
			return false;
		}
	
	void  pop() {
		if(top!=-1) {
			System.out.println("Element deleted:"+stk[top]);
			top--;
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
	
	void display() {
		if(top!=-1) {
			System.out.println();
			System.out.print("[");
			for(int i=0;i<=top;i++) {
				System.out.println(stk[i]+",");
			}
			System.out.print("]");
			System.out.println();
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
}



public class StackasArray {

	public static void main(String[] args) {
		MyStack ms1=new MyStack(3);
		
		System.out.println(ms1.push(10));
		System.out.println(ms1.push(20));
		
		ms1.display();
		
		System.out.println(ms1.push(30));
		System.out.println(ms1.push(40));
		
		ms1.display();
		
		ms1.pop();
		ms1.pop();
		ms1.pop();
		ms1.pop();
		
		

	}

}
