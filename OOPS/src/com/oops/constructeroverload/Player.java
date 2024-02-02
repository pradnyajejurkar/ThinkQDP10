package com.oops.constructeroverload;

public class Player {
	
	private int playerid;
	private String name;
	private boolean isBaller;
	private float strikerate;
	private int runs;
	
	public Player() {
		
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

}
