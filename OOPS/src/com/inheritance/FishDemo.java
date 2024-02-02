package com.inheritance;

class Fish{
	private String name;
	private int gills;
	
	public Fish() {
		
	}
	
	public Fish(String name,int gills) {
		super();
		this.name=name;
		this.gills=gills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGills() {
		return gills;
	}

	public void setGills(int gills) {
		this.gills = gills;
	}
	
	void swim() {
		System.out.println("Fish types");
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", gills=" + gills + "]";
	}
	
	
}

class GoldFish extends Fish{
	
	public GoldFish() {
		
	}
	
	public GoldFish(String name,int gills) {
		super(name,gills);
	}
	
	@Override
	public void swim() {
		System.out.println("Type of fish is gold fish");
	}
	
	public String toString() {
		return "GoldFish:"+
	}
}


class Whale extends Fish{
	
}

public class FishDemo {

	public static void main(String[] args) {
		

	}

}
