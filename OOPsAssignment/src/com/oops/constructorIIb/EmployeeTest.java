package com.oops.constructorIIb;

public class EmployeeTest {
	
	private int id,deptno;
	private String name;
	private double basicsal,pf,hra,da,netsal;
	
	
	EmployeeTest(){
		
	}
	
	EmployeeTest(int id,int deptno,String name,double basicsal){
		this();
		this.id=id;
		this.deptno=deptno;
		this.name=name;
		this.basicsal=basicsal;
		
	}
	
	public double calSal() {
		pf=basicsal*0.1;
		hra=basicsal*0.15;
		da=basicsal*0.2;
		
		netsal=basicsal-pf+hra+da;
		return netsal;
	}
	
	public void displayEmp() {
		System.out.println("Emp id:"+id);
		System.out.println("Emp deptno:"+deptno);
		System.out.println("Emp name:"+name);
		System.out.println("Emp netsal:"+calSal());
		
	}
	public static void main(String[] args) {
		EmployeeTest e1=new EmployeeTest(101,10,"pradnya",40000);
		e1.displayEmp();
		
		EmployeeTest e2=new EmployeeTest(102,12,"neha",30000);
		e1.displayEmp();
		
		
	}

}
