package com.assignment.methodoverloading;

public class Mydate {

	private String day;
	private String month;
	private int year;

	public Mydate() {

	}

	public Mydate(String day, String month, int year) {
		this();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return "Mydate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
