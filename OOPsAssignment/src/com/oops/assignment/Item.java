package com.oops.assignment;

public class Item {

	private int itemid;
	private String itemname;
	private double cost;
	private int qty;

	Item() {

	}
	
	Item(int itemid,String itemname,double cost,int qty){
		this.itemid=itemid;
		this.itemname=itemname;
		this.cost=cost;
		this.qty=qty;
		
	}
	
	public void setItemid(int itemid) {
		this.itemid=itemid;
	}
	
	public int getItemid() {
		return itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
 
	public double calTotalPrice() {
		double totalPrice=qty*cost;
		return totalPrice;
	}
	
	public double calDiscountedPrice(double discount) {
		double total=calTotalPrice();
		double discPrice=total-((discount/100)*total);
		return discPrice;
	}
	
	public void compareCost(Item i2)
	{
		if(this.cost==i2.cost)
			System.out.println("Both have same cost..");
		else if(this.cost>i2.cost)
			System.out.println(this.getItemname()+" has higher cost");
			else 
				System.out.println(i2.getItemname()+" has higher cost");
	}
	public String toString()
	{
		return "Item:"+itemid+" "+itemname+" "+cost+" Total:"+ calTotalPrice();
	}
	
	

}
	
	

