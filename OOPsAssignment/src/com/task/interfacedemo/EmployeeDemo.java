package com.task.interfacedemo;
/*Task3>>
Create an interface to pay any amount . It can be used by employee or celebrity to pay the tax a
and by a student to pay the fees
Use the concept of functional interface here*/



interface Payment{
   void pay(int amount);
}

class Employee implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("you are employee you give tax :"+amount);
		
	}
	
}

class Celebrity implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("you are celebrity you give tax:"+amount);
		
	}
	
	
}

class Student implements Payment{

	@Override
	public void pay(int amount) {
	System.out.println("you are student you pay fees: "+amount);
	}
	
}
public class EmployeeDemo {
  
	public static void main(String[] args) {
	   Payment p;
	   p=new Employee();
	   p.pay(45000);
	   System.out.println(p);
	
	}

}
