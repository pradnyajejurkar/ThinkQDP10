package com.oops.constructeroverload;

public class Cricketer {

	private int playerid;
	private String name;
	private boolean isBaller;
	private float strikerate;
	private int runs;

	public Cricketer() {

	}

	public Cricketer( String name, boolean isBaller, float strikerate, int runs) {
		
		this.name = name;
		this.isBaller = isBaller;
		this.strikerate = strikerate;
		this.runs = runs;
	}
	public Cricketer(int playerid, String name, boolean isBaller, float strikerate, int runs) {
		this.playerid = playerid;
		this.name = name;
		this.isBaller = isBaller;
		this.strikerate = strikerate;
		this.runs = runs;
	
   }
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setIsBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}

	public boolean getIsBaller() {
		return isBaller;
	}

	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}

	public float getStrikerate() {
		return strikerate;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}
	
	public void display() {
		System.out.println(playerid);
		System.out.println(name);
		System.out.println(isBaller);
		System.out.println(strikerate);
		System.out.println(runs);
		System.out.println("-----------------------");
	}
}
