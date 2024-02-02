package com.oops.constructeroverload;

public class PlayerTest {

	public static void main(String[] args) {
		Player p = new Player();

		p.setPlayerid(7);
		p.setName("Dhoni");
		p.setIsBaller(false);
		p.setStrikerate(90);
		p.setRuns(1000);
		System.out.println(p.getPlayerid());
		System.out.println(p.getName());
		System.out.println(p.getIsBaller());
		System.out.println(p.getStrikerate());
		System.out.println(p.getRuns());

	}

}
