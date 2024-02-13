package com.task;

import java.util.Scanner;

import com.example2.Student;

public class EmployeeTest {

	static void displayAllEmployee(Employee e[]) {
		for (Employee e1 : e) {
			System.out.println(e1);
		}
	}

	static void sortEmployeeSalaryWise(Employee e[]) {
		Employee etemp = new Employee();
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].getSalary() < e[j].getSalary()) {
					etemp = e[i];
					e[i] = e[j];
					e[j] = etemp;
				}
			}
		}
	}

	static void maxSalary(Employee e1[]) {
		double maxSalary = e1[0].getSalary();
		
		//System.out.println("max salary:"+maxSalary);
		//for (Employee e : e1) {
		Employee etemp = e1[0];
		for(int i=1;i<e1.length;i++) {
		 
			if (e1[i].getSalary()>maxSalary) {
				System.out.println(e1[i].getSalary());
				maxSalary=e1[i].getSalary();
				
				etemp = e1[i];
				System.out.println(etemp);
			}

		}
		//System.out.println(etemp);
		System.out.println("max salary:"+maxSalary);
	
	}
	
//		static void maxSalary(Employee e1[]) {
//			double maxSalary = e1[0].getSalary();
//			
//			System.out.println("max salary:"+maxSalary);
//			//for (Employee e : e1) {
//			for(int i=1;i<e1.length;i++) {
//				Employee etemp = new Employee();
//				if (e1[i].getSalary()>maxSalary) {
//					System.out.println(e1[i].getSalary());
//					maxSalary=e1[i].getSalary();
//					
//					etemp = e1[i];
//				}
//
//			}
//			//System.out.println(etemp);
//			System.out.println("max salary:"+maxSalary);
//		}
	
	static Scanner sc = new Scanner(System.in);

	static void enterEmployeeDetails(Employee e) {

		System.out.println("Enter employee id:");
		e.setEid(sc.nextInt());

		System.out.println("Enter employee name:");
		e.setEname(sc.next());

		System.out.println("Enter employee salary:");
		e.setSalary(sc.nextDouble());

		Department d = new Department();
		e.setDept(d);

		e.setDept(new Department());
		System.out.println("Enter department id:");
		e.getDept().setId(sc.nextInt());

		System.out.println("Enter department name:");
		e.getDept().setName(sc.next());

		System.out.println("Enter department location:");
		e.getDept().setLocation(sc.next());

	}

	static void displayDetails(Employee e1[]) {
		System.out.println("---------------------------------------");
		for (Employee e : e1) {
			System.out.println(e);
		}
	}

//	Employee emp[]=new Employee[3];	
//	//anonymous object
//		
//	emp[0]=new Employee(101,"pradnya",50000,new Department(102, "HR", "Pune"));
//	emp[1]=new Employee(103,"neha",40000,new Department(104, "Sales", "Mumbai"));
//	
//	emp[2]=new Employee();
//	emp[2].setEid(105);
//	emp[2].setEname("Raj");
//	emp[2].setSalary(54000);
//	emp[2].setDept(new Department(106,"Eng","pune"));
//	
//	for(Employee e:emp) {
//		System.out.println(e);
//	}

	public static void main(String[] args) {
//		Department d[]=new Department[2];
//		d[0]=new Department(1,"pradnya","pune");
//		d[1]=new Department(2,"ram","mumbai");
//		
		Employee emp[] = new Employee[2];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();

			enterEmployeeDetails(emp[i]);

		}

		displayDetails(emp);
		System.out.println("------------------------------------");
		//sortEmployeeSalaryWise(emp);
		//displayDetails(emp);
		System.out.println("-----------------------------");
		maxSalary(emp);
		displayDetails(emp);
	}

}
