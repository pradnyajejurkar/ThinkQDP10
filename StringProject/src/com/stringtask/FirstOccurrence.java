package com.stringtask;

public class FirstOccurrence {

	static void firstOccurrence(String s,char ch) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				System.out.println(ch+ " at index:"+i);
				break;
			}
			
		}
	}
	
	static void middleOccurrence(String s,char ch) {
		int count=0,i;
		for( i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				System.out.println(ch+ " at index:"+i);
				count++;
				if(count==2) {
				break;
			}
			
		}
	}
	
}
	
	  public static void printCommon(String arr1[], String arr2[])
	    {  
	       
	        for (int i=0; i<arr1.length; i++){
	            for(int j=0;j<arr2.length;j++)
	                if (arr1[i].equals(arr2[j])){
	                    System.out.print(arr1[i]+" "); 
	            }  
	        }
	    }  
	

	public static void main(String[] args) {
		String str="pradnya";
		String str1[]={"java" ,"c","c++"};
		String str2[]={"java" ,"c","python","html"};
		
		
		//firstOccurrence(str, 'a');
		middleOccurrence(str, 'y');
		System.out.println(str.lastIndexOf('y'));
		
		printCommon(str1, str2);
	}

}
