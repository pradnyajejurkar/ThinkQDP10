package com.labsession.conditionstatement;
//Write a Java program to count total number of notes in given amount.
import java.util.Scanner;

public class NoteTest {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n700=0,n500=0,n200=0,n100=0,n50=0,n20=0,n10=0;
	int amount;
	System.out.println("Enter the amount:");
	amount=sc.nextInt();
	if(amount>500)
	{
		n500=amount/500;
		amount=amount-n500*500;
	}
	    if(amount>=200)
	    {
	    	n200=amount/200;
	    	amount=amount-n200*200;
	    }
	    if(amount>=100) {
	    	
	    	n100=amount/100;
	    	amount=amount-n100*100;
	    }
	    if(amount>=50) {
	    	
	    	n50=amount/50;
	    	amount=amount-n50*50;
	    }
	    if(amount>=20) {
	    	
	    	n20=amount/20;
	    	amount=amount-n20*20;
	    }
	    if(amount>=10) {
	    	
	    	n10=amount/10;
	    	amount=amount-n10*10;
	    }
	    else {
	    		System.out.println(n500 + ":note of 500 ");
	    		System.out.println(n200 + ":note of 200 ");
	    		System.out.println(n100 + ":note of 100 ");
	    		System.out.println(n50 + ":note of 50 ");
	    		System.out.println(n20 + ":note of 20 ");
	    		System.out.println(n10 + ":note of 10 ");
	    		


	    }
	    }
	}


