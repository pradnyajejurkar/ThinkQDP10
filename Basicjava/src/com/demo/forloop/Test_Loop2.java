package com.demo.forloop;

public class Test_Loop2 {

	public static void main(String[] args) {
		
		int i;
		
		//for(i=1;i<=5;i++) {
			/*System.out.println(i);
			System.out.println("i");
			System.out.println("i="+i);
		}*/
			//case1
			/*for(;;) { //gives infinite loop
				System.out.println("pradnya");
			}*/
		
		//case2
		/*for(i=1;;)  // gives infinite loop
			System.out.println("A");
		}*/
		
		//case3
		/*for(i=1;i<=5;) {  //gives infinite loop
			System.out.println("A");
		}*/
		
		//case4
		for(i=1;i<=5;i--) { //gives infinite loop
			System.out.println("A");
		}
	}
}

	


