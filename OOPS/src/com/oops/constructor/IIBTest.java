package com.oops.constructor;
//IIB- instance initializer block(anonumous block)

class Movie{
	private int movieid;
	private String moviename;
	
	{
		System.out.println("IIB_1");
	}
	{
		System.out.println("IIB_2");
	}
	
	public Movie(int movieid,String moviename) {
		this.movieid=movieid;
		this.moviename=moviename;
		System.out.println("mid:"+movieid);
		
	}
}
public class IIBTest {

	public static void main(String[] args) {
		Movie m1=new Movie(1,"abc");
		Movie m2=new Movie(2,"pqr");

	}

}
