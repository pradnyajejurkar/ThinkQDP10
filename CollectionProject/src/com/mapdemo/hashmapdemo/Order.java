package com.mapdemo.hashmapdemo;

public class Order implements Comparable<Order> {
 
	private int id;
	private String orderDetails;
	private long cost;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String orderDetails, long cost) {
		super();
		this.id = id;
		this.orderDetails = orderDetails;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDetails=" + orderDetails + ", cost=" + cost + "]";
	}
	@Override
	public int compareTo(Order o) {
		if(this.id==o.id) 
			return 0;
			else if(this.id>o.id)
				return -1;
			else
				return 1;
		
	}
	
}
