package com.oops.constructeroverload;


class Employee{
	private int eid;
	private String ename;
	private double esal;
	
	Employee() {
		System.out.println("default constructor");
		esal=30000;
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		
	}
	
	Employee(int eid,String ename){
		this();
		System.out.println("parameterised cons 1");
		this.eid=eid;
		this.ename=ename;
		System.out.println(this.eid);
		System.out.println(this.ename);
		System.out.println(this.esal);
	}
	
	Employee(int eid,String ename,double esal){
		System.out.println("para con 2");
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	
	public void setEsal(double esal) {
		this.esal=esal;
	}
	
	public double getEsal() {
		return esal;
	}
	public String toString() {
		return "EmpId:"+eid+"\tEmpName:"+ename+"\tEmpSal:"+esal;
	}
	
}	
public class EmployeeTest {

	public static void main(String[] args) {
	  // Employee e1=new Employee(); 
	  // System.out.println(e1);

	   Employee e2=new Employee(101,"pradnya");
	 //  System.out.println(e2);
	   
	   
	   Employee e3=new Employee(102,"neha",40000);
	 //  System.out.println(e3);
	   
	   e3.setEsal(5000);
	   System.out.println(e3);
	
	}

}
