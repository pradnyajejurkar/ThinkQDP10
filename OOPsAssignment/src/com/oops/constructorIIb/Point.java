package com.oops.constructorIIb;

public class Point {
	
	private int m_x,m_y;
	
	public Point(int x,int y) {
		m_x=x;
		m_y=y;
	}
	
	public Point() {
		this(20,10);
	}
	public void setX(int m_x) {
		this.m_x=m_x;
	}
	
	public int getX() {
		return m_x;
	}
	
	public void setY() {
		this.m_y=m_y;
	}
	public int getY() {
		return m_y;
	}
	public static void main(String[] args) {
		Point p=new Point();
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
