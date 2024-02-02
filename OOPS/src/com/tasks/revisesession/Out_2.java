package com.tasks.revisesession;

public class Out_2 {
	
		public static void main(String[] args) {
			Tree rose = new Tree();
			Tree tulip = new Tree();
			Flower f=new Flower() ;
			f.color= "red" ;
			f.petals = new Petals();
			f.petals.noOfPetals = 5;
			f.petals.shape= "round" ;
			rose.f = f ;
			tulip.f = rose.f ;
			f.color = "white" ;
			f.petals = new Petals();
			f.petals.noOfPetals =4 ;
			f.petals.shape= "oval" ; 
			System.out.println(tulip.f.petals.noOfPetals);
			System.out.println(tulip.f.petals.shape);	
		}
	}

	class Tree { 
		int height ; 
		Flower f ; 
	}
	class Flower {
		String color ;
		Petals petals ;
	}
	class Petals {
		int noOfPetals ;
		String shape ; 
	}


