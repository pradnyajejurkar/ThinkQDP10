package com.hashmaptask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpMapTest {

	public static void main(String[] args) {
		 ArrayList<Employee> elist = new ArrayList<>();

	        elist.add(new Employee(101, "Pradnya", 60000.0, new Department(1,"HR")));
	        elist.add(new Employee(102, "Ram", 55000, new Department(2,"IT")));
	        elist.add(new Employee(103, "Neha", 45000, new Department(3,"IT")));
	        elist.add(new Employee(104, "Raj", 55000, new Department(2,"IT")));
	        
	        Map<String, Integer> dem = new HashMap<>();

	        for (Employee emp : elist) {
	            String deptName = emp.getDept().getDname();
	            dem.put(deptName, dem.getOrDefault(deptName, 0) + 1);
	        }

	        
	        for (Map.Entry<String, Integer> en : dem.entrySet()) {
	            System.out.println("Department: " + en.getKey() + ", Employees: " + en.getValue());
	        }

	    System.out.println("--------------------------------------------");
	
	    Map<String, ArrayList<Employee>> dlist = new HashMap<>();
	 
         for (Employee emp : elist) {
           String deptName = emp.getDept().getDname();
              dlist.computeIfAbsent(deptName, k -> new ArrayList<>()).add(emp);
           }

    
         for (Map.Entry<String, ArrayList<Employee>> entry : dlist.entrySet()) {
            System.out.println("Department: " + entry.getKey());
             for (Employee emp : entry.getValue()) {
             System.out.println("  Employee: " + emp.getName());
         }
     }
}
}
