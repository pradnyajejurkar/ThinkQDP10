package com.task;

import java.util.Scanner;

public class CompanyTest {

	
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
	
	
	static void maxSalary(Employee et[]) {
		double max=et[0].getSalary();
		Employee temp = new Employee();
		String name="";
		for (int i = 0; i < et.length; i++) {
			for (int j = i + 1; j < et.length; j++) {
				if(et[i].getSalary()>max) {
					max=et[i].getSalary();
					name=et[i].getEname();
				}
				
			}
			
		}
		System.out.println("max:"+max);
		
	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();

			enterEmployeeDetails(emp[i]);

		}
		
		displayAllEmployee(emp);
		System.out.println("----------------------------");
		sortEmployeeSalaryWise(emp);
		displayAllEmployee(emp);
		
		System.out.println("-------------------------------------");
		
		maxSalary(emp);
		displayAllEmployee(emp);
		
	}

}
