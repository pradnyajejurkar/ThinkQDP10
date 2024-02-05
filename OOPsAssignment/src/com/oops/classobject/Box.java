package com.oops.classobject;

/*13)Create class Box and calculate the volume of box
volume=length x width x height
14)
calculate the area of rectangle*/

public class Box {
	
	//double length,width,height;
	
	public double calVolume(double length,double width,double height) {
		double volume=length*width*height;
		//System.out.println("Volume:"+volume);
	
		return volume;
	}

	public double calArea(double length,double breadth) {
		double area=length*breadth;
		//System.out.println("Area of Rectangle:"+area);
		
	return area;	
	}
	public static void main(String[] args) {
		Box b1=new Box();
		System.out.println("Volume of box is:" +b1.calVolume(10,20,30));
		System.out.println("Area of Rectangle:" +b1.calArea(10,20));
	}

}
