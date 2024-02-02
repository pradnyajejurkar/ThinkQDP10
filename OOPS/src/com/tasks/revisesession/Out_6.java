package com.tasks.revisesession;
public class Out_6 {
	static int i   ;
	int j = 5 ; 
	static {
		System.out.println("first " + i++);
	}
	{
		System.out.println("instance " + (i+j));
	}
	public static void main(String[] args) {
		Out_6  o1 = new Out_6();
		Out_6  o2 = new Out_6();
		

	}
	static {
		System.out.println("second" +i++);
	}

}
class blocks {
	
}
