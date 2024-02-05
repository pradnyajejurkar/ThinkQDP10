package com.labsession.conditionstatement;


public class Num_Divisiblety_Test {

	public static void main(String[] args) {
		
		
		int i;
		
        for(i=1;i<=50;i++) 
        {
		if(i%3==0 && i%5==0) 
		{
			System.out.println("welcome");
		}
		else if(i%3==0) {
			System.out.println("hello");
		}
		else if(i%5==0) {
			System.out.println("bye");
			
		}
		else {
			System.out.println(i);
		}
         
	}
}
}

