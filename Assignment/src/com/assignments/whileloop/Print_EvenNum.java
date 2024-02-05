package com.assignments.whileloop;

public class Print_EvenNum {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Even numbers between 1 to 100 are :");
        while(i<=100) 
        {
		 if(i%2 == 0) 
		{
		System.out.println(i);
		}
		i++;
	    }
    }
}