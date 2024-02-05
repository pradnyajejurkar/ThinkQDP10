package com.assignments.method;

public class PrintPerfectNum {
	
	public static boolean isPerfect(int num){
	
	int i,sum=0;
	for(i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
	if(sum==num) {
		return true;
	}else {
			return false;
	}
	
}
	public static void main(String args[]){
		for(int i=1; i<=10000; i++)
    {
        if(isPerfect(i))
          System.out.println(i);
 
    }
 
   }
}