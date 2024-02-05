package com.assignment.loop;
//2.WAP to print odd numbers from 521 to 229 using while loop
public class Print_OddNum512to229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=521; 
	    System.out.println("Odd numbers between 521 to 229 are :");
		while(i>=229) 
		{
		if(i%2 != 0) 
		{
			System.out.println(i);
		}
		i--;
	}

}
}