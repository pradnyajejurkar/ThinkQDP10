package com.inheritance.assignment;
/*. Create class IPLTeam with method play. Create child classes of IPLTeam 
called as CSK, RCB. In main, call play from child class objects.*/

class IPLTeam {
	public void play() {
		System.out.println("play method");
	}
}

class Csk extends IPLTeam {
	void play1() {
		System.out.println("Csk team");
	}
}

class Rcb extends IPLTeam {
	void play2() {
		System.out.println("Rcb team");
	}
}

public class IPLTeamTest {
	public static void main(String[] args) {
		Csk c = new Csk();
		c.play();

		Rcb r = new Rcb();
		r.play();
	}
}
