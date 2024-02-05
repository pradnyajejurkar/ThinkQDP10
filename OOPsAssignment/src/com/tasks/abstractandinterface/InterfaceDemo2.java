package com.tasks.abstractandinterface;
/*Write a Java program to create an interface Playable with a method play() that takes no arguments 
and returns void. 
Create three classes Football, Volleyball, and Basketball that implement the Playable interface 
and override the play() method to play the respective sports.*/

interface Playable {
	void play();
}

class Football implements Playable {

	@Override
	public void play() {
		System.out.println("No of players is 11");

	}

}

class Volleyball implements Playable {

	@Override
	public void play() {
		System.out.println("No of palyers is 6");

	}

}


class Basketball implements Playable{

	@Override
	public void play() {
		System.out.println("No of players is 5");
	
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		Playable p;
		p=new Football();
		p.play();
		
		
		p=new Volleyball();
		p.play();
		
		
		p=new Basketball();
		p.play();

	}

}
