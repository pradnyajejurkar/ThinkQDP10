package com.oops.assignment;

public class PrimeNum {

	int num;
	public PrimeNum() 
	{
		
	}
    public PrimeNum(int num) {
    	this.num=num;
    }
	
	public boolean checkPrime() {
	 boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
			
		}
	return flag;
	}
	}

	
