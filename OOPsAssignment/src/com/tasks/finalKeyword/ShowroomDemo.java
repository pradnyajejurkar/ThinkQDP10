package com.tasks.finalKeyword;


class Showroom{
	int showroomid;
	final static String showroomName;
	final int space;
	
	static 
	{
	 showroomName="Mahendra";	
	}
	
	Showroom(){
		space=200;
	}

	public Showroom(int showroomid,int space) {
		super();
		this.showroomid = showroomid;
		this.space=space;
		
	}

	public int getShowroomid() {
		return showroomid;
	}

	public void setShowroomid(int showroomid) {
		this.showroomid = showroomid;
	}

	public static String getShowroomname() {
		return showroomName;
	}

	public int getSpace() {
		return space;
	}
	
	final void empRules() {
		System.out.println("15 minutes overtime payment");
	}
	
}

class BikeShowroom extends Showroom{
	
//	void empRules() {
//		System.out.println("bike rules");
//	}
//	
	
}
public class ShowroomDemo {

	public static void main(String[] args) {
	 Showroom s1=new Showroom(101,300);
	 
	 System.out.println(s1.showroomid+" "+s1.space);
	}

}
