package com.tasks.finalKeyword;

class Game{
	protected int noOfPlayers;
	public void rules() {
		System.out.println("listen refry instruction");
	}
	
	public void getNoOfPlayers() {
		noOfPlayers=10;
		System.out.println("no of players:"+noOfPlayers);
	}
}
class BasketBall extends Game{
	public void rules() {
		System.out.println("Shouldening is not allowed");
	}
	
	public void getNoOfPlayers() {
		noOfPlayers=8;
		System.out.println("no of players:"+noOfPlayers);
	}
}

class Soccer extends Game{
	public void rules() {
		System.out.println("must have 11 players");
	}
	
	public void getNoOfPlayers() {
		noOfPlayers=11;
		System.out.println("no of players:"+noOfPlayers);
	}
}

class Cricket extends Game{
	public void rules() {
		System.out.println("ball temporing is not allowd");
	}
	
	public void getNoOfPlayers() {
		noOfPlayers=12;
		System.out.println("no of players:"+noOfPlayers);
	}
}
public class GameTest {
	public static void main(String[] args) {
		Game g;
		g=new BasketBall();
		g.rules();
		g.getNoOfPlayers();
		
		g=new Cricket();
		g.rules();
		g.getNoOfPlayers();
		
		g=new Soccer();
		g.rules();
		g.getNoOfPlayers();
	}
}
