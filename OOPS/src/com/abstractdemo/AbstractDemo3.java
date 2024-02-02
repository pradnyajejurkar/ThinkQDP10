package com.abstractdemo;

abstract class Subject{
	
	private  int sub_id;
	private String sub_name;
	
	Subject(){
		System.out.println("learn subject");
	}
	
	Subject(int sub_id,String sub_name){
		super();
		this.sub_id=sub_id;
		this.sub_name=sub_name;
	}
	
	public void setSub_id(int sub_id) {
		this.sub_id=sub_id;
	}
	
	public int getSub_id() {
		return sub_id;
	}
	
	public void setSub_name(String sub_name) {
		this.sub_name=sub_name;
	}
	
	public String getSub_name() {
		return sub_name;
	}
	
	abstract void syllabus();
	
	void learn() {
		System.out.println("Pr");
	}
}


public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
