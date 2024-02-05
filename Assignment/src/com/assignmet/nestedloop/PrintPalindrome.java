package com.assignmet.nestedloop;

public class PrintPalindrome {

  public static boolean isPalindrome(int n)
		{
			int rev = 0;
			int temp=n;
			
			for (int i=1; i<=n; i++)
				while(n>0) {
					rev=rev*10+n%10;
					n/=10;
			}
			if(temp==rev)
				return true;
			else
				return false;
		}
		
	  public static void countPal(int range)
	  {
	      for (int i = 1; i <= range; i++) {
	    	 boolean status=isPalindrome(i);
	            if(status)
	            	System.out.println(i);
	      }
	 }
	   
	 
	  public static void main(String args[])
	  {
	      countPal(500);
	    
	  }
	}

	