package com.oops.classobject;

public class Food {

	int foodid;
	String foodname;
	double foodprice;
	
	/*public void setfood(int fid,String fname,double fprice) {
	
			foodid=fid;
			foodname=fname;
			foodprice=fprice;
	}*/
	
	public void setfood(int foodid,String foodname,double foodprice) {
		
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
	}
	 public void showFood() {
		 System.out.println("Food id:"+foodid);
		 System.out.println("Food name:"+foodname);
		 System.out.println("Food price:"+foodprice);
		 System.out.println("----------------------");
	 }
	
}
