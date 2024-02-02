package com.containment;

public class Author {

	private int aid;
	private String aname;

	public Author() {

	}

	public Author(int aid, String aname) {
		this.aid = aid;
		this.aname = aname;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getAid() {
		return aid;
	}

	public void setAname() {
		this.aname = aname;
	}

	public String getAname() {
		return aname;
	}

	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + "]";
	}

}
