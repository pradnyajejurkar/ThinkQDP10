package com.enumdemo;


enum Season{SUMMER,WINTER,MONSOON};

public class EnumDemo2 {

	public static void main(String[] args) {
		
		Season s=Season.SUMMER;
		
		switch(s) {
		case SUMMER: System.out.println("Cotton cloths");
					 break;
					 
		case WINTER: System.out.println("Woollen cloths");
		 			break;	
		 
		case MONSOON: System.out.println("Umbrella and raincoat");
		 			break;
		 			
		 default:System.out.println("error");			
		}

	}

}
