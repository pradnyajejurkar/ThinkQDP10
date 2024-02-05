package com.inheritance.assignment;
/*. Create Class Laptop which has variables noOfUSBPort, processorSpeed of 
type int. Create getter, setter methods for the variables. In main method, 
1> create Laptop object 2> set values of variables noOfUSBPort, 
processorSpeed using setter methods. 3> print variables noOfUSBPort, 
processorSpeed using getter methods.*/

public class Laptop {
	private int noOfUSBPort;
	private int processorSpeed;

	public Laptop() {

	}

	public Laptop(int noOfUSBPort, int processorSpeed) {
		super();
		this.noOfUSBPort = noOfUSBPort;
		this.processorSpeed = processorSpeed;
	}

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		
		l1.setNoOfUSBPort(5);
		l1.setProcessorSpeed(2);
		
		System.out.println("NoOfUSBPorts:"+l1.getNoOfUSBPort());
		System.out.println("Processor Speed:"+l1.getProcessorSpeed());
	
	}
}
