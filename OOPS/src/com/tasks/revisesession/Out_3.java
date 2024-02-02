package com.tasks.revisesession;

public class Out_3 {
	
		public static void main(String args[]) {
			Calculate c = new Display();
			c.x = 0;
			c.cal(5);
			System.out.print(c.x);
		}
	}

	interface Calculate {
		int x = 8;
		static void cal(int item) {
			System.out.println(item + item);
		}
	}

	class Display implements Calculate {
		int x;
		public void cal(int item) {
			x = item * item;
		}
	}

