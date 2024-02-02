package com.finaldemo;
//final: restrict the user

//variable,method,class

//final and static: while declaration or static block:comman to all objects
//final and instance: constructor (in all),instance,seperate for all objects

//final class Developer

class Developer{
	int id;
	String name;
	//final static int noOfHours:8;
	
	final static int noOfHours;
	final String panNo;
	
	static {
		noOfHours=8;
	}
	{
		//panNo="not defind";
	}
	
	public Developer() {
		//noOfHours=8;
		this.panNo="Unknown";
	}
	
	public Developer(int id, String name,String panNo) {
		this.id=id;
		this.name=name;
		this.panNo=panNo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNoOfhours() {
		return noOfHours;
	}

	public String getPanNo() {
		return panNo;
	}
	
	final void basicSkills() 
	{
		System.out.println("HTML,CSS,C,C++,Java");
	}
}

class FullStackDeveloper extends Developer
{
//	 void basicSkills() {
//		System.out.println("HTML,CSS,C,C++,Jva,SpringBoot");
//	}
}


public class FinalDemo1 {

	public static void main(String[] args) {
		Developer d1= new Developer(101, "Pravin", "JKI90045");
		//	d1.panNo="LK907333";
			d1.name="Pravin N";
		System.out.println(d1.id+ " " +d1.name+ " "+d1.panNo);	
	}

}
