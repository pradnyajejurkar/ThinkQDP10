package com.assignment.loop;



//print all numbers from 1 to 50 if no is divisible by 3 print hii,if no is divisible by 3 and 5 hello
//1 2 hii 4 5 hii
public class DemoClass1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=50;i++) {
			
		//System.out.println(i);
		
		if((i%3==0) && (i%5==0)) {
			System.out.println("hello");
		}else if(i%3==0) {
			System.out.println("hii");
		//}else if(i%5==0){
			//System.out.println("hello");
		}else {
			System.out.println(i);
		}
		
		
		}
	}
}
