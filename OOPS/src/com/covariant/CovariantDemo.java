package com.covariant;



class Person{
	int id;
	String name;
	
	Person(){
		
	}
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Person showDetails() {
		name=name+"India";
		return this;
	}
}

class Employee extends Person{
	float salary;
	
	Employee(){
		
	}
	
	Employee(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
//	Person showDetails() {
//		name=name+"ThinQ";
//		salary=salary+1000;
//		return this;
//	}
	
	Employee showDetails() {
		name=name+"ThinQ";
		salary=salary+1000;
		return this;
	}
	
}
public class CovariantDemo {

	public static void main(String[] args) {
		Person p;
		Employee e;
		
		Person p1=new Person(101,"pradnya");
		p=p1.showDetails();
		System.out.println(p1.id+ " " +p1.name);
		
//		Employee e1=new Employee(102,"neha",45000f);
//		p=e1.showDetails();
//		System.out.println(p1.id+ " " +p1.name);
		
//		e=(Employee) e1.showDetails();// casting requird
//		System.out.println(e.id+ " " +e.name+ " " +e.salary);
		
		
		Employee e1=new Employee(102,"neha",45000f);
		e=e1.showDetails();//no casting requird
		System.out.println(e.id+ " " +e.name+ " " +e.salary);
		
		
		
	}

}
