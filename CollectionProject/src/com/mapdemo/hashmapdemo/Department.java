package com.mapdemo.hashmapdemo;

public class Department {

	private int did;
	private String dname;
	private String designation;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", designation=" + designation + "]";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Department(int did, String dname, String designation) {
		super();
		this.did = did;
		this.dname = dname;
		this.designation = designation;
	}
	
	
	
}
