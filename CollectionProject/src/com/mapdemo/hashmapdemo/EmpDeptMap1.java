package com.mapdemo.hashmapdemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary()-o1.getSalary());
	}
}
public class EmpDeptMap1 {

public static void main(String[] args) {
     HashMap<Employee, Department> emap=new HashMap<>();
		
		emap.put(new Employee(101,"Amit",17000.0),new Department(1,"IT","Pune"));
		emap.put(new Employee(102,"Nitu",27000.0),new Department(2,"Sales","Mumbai"));
		emap.put(new Employee(103,"Meeta",21000.0),new Department(1,"IT","Pune"));
		emap.put(new Employee(101,"Amit",17000.0),new Department(2,"Sales","Mumbai"));
		emap.put(new Employee(108,"Mohit",20000.0),new Department(2,"Sales","Mumbai"));
		emap.put(new Employee(107,"Neema",18000.0),new Department(2,"Sales","Mumbai"));
		emap.put(new Employee(105,"Simi",12000.0),new Department(2,"Sales","Mumbai"));

		
		
		
		for(Map.Entry<Employee, Department> e:emap.entrySet()) {
			
		 System.out.println(e.getKey());
		 System.out.println(e.getValue());
		 System.out.println("---------------------------");
		}
		
		 System.out.println("---------------------------");

		 TreeMap<Employee, Department> tm= new TreeMap<>(new SalaryComparator());
		 tm.putAll(emap);
		 
		 for(Map.Entry<Employee, Department> e:emap.entrySet()) {
				
		System.out.println(e.getKey());
	     System.out.println(e.getValue());
	}

	}
}

