package com.assignment.loop;

public class SeriesPrint {
	
	public static void seriesPrint2() {
		int num1=0,num2=2;
		for(int i=0;i<=10;i++) {
			
			num1=num1+num1+1;
			System.out.println(num1+" ");
			
			System.out.println(num2+ " ");
			num2=num2+num2-1;
		}
	}
	public static void seriesPrint1() {
		int num=1;
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+" ");
			num=num+num+1;
		
		}
		System.out.println("--------------");
	}

	public static void seriesPrint() {
		int i,num=2;
		for(i=2;i<=10;i++) {
			System.out.println(num+ " ");
			num=num+num-1;
			
		}
	}
	public static void main(String args[]) {
		//seriesPrint1();
		//seriesPrint();
		seriesPrint2();
	}
}