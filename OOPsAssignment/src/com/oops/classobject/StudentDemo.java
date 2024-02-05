package com.oops.classobject;

class Student1{
	double marksS1,marksS2,marksS3;
	
	public void setMarks(int m1,int m2,int m3) {
		marksS1=m1;
		marksS2=m2;
		marksS3=m3;
		
	}
	
	public double findPer(double m1,double m2,double m3 )
	{
		double total=m1+m2+m3;
		double per=(total/300)*100;
		return per;
		
	}
	
	public void displayClass(double m1,double m2,double m3) {
		 double per=findPer(m1,m2,m3);
		if(per>90) {
			System.out.println("First class");
		}else if(per>70) {
			System.out.println("Second class");
		}else if(per<60) {
			System.out.println("Third class");
		
		}
	}
}


public class StudentDemo {

	public static void main(String[] args) {
		Student1 st1=new Student1();
		
	
		System.out.println("per is:"+st1.findPer(90,70,60));
	    st1.displayClass(90,70,60);
	}

}
