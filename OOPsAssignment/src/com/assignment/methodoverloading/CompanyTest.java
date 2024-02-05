package com.assignment.methodoverloading;

public class CompanyTest {

	public static void main(String[] args) {
		//1.using anonums department

		/*Employee e1=new Employee(101,"Pradnya",40000,new Department(1,"Marketing"));
		Employee e2=new Employee(102,"Raj",45000,new Department(2,"HR"));
		Employee e3=new Employee(103,"Neha",50000,new Department(3,"QA"));
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);*/	
		
		
		//2.using department object:using costructor
		System.out.println("------------------------------------");
		
		Department d1=new Department(1,"Marketing");
		Department d2=new Department(2,"HR");
		Department d3=new Department(3,"QA");
		
		
		Mydate m1=new Mydate("monday","August",2020);
		Mydate m2=new Mydate("tuesday","june",2022);
		Mydate m3=new Mydate("thursday","may",2023);

		
		
		Employee e1=new Employee(101,"Pradnya",70000,d1,m1);
		Employee e2=new Employee(102,"Raj",45000,d2,m2);
		Employee e3=new Employee(103,"Neha",50000,d3,m3);
		Employee e4=new Employee(104,"Nikita",55000,d3,m3);
		Employee e5=new Employee(105,"Rahul",570000,d1,m1);
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		
		System.out.println("---------------------------------------");
		
		System.out.println(e1.getDept().hashCode());
		System.out.println(e2.getDept().hashCode());
		
		System.out.println(e3.getDept().hashCode());
		System.out.println(e4.getDept().hashCode());
		
		
	}

}
