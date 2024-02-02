package com.oops.classobject;

public class ArmstrongNum {
  int num;
  
	public ArmstrongNum() 
	{
		
	}
	
	public ArmstrongNum(int num) {
		this.num=num;
	}
	
	public int power(int base,int pow) {
		int i,ans=1;
		for(i=1;i<=pow;i++) 
		{
		ans=ans*base;	
			
		}
		return ans;
	}
	
	public int countDigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	
	public boolean checkArmstrong() {
		int sum=0;
		int temp=num,original=num;
		int ct=countDigit(num);
		while(temp!=0) {
			int rem=temp%10;
			sum=sum+power(rem,ct);
			temp/=10;	
		}
		//return original==sum;
		if(original==sum)
			return true;
		return false;
			
		
		}
	}

