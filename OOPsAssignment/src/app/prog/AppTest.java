package app.prog;

import app.mob.MobileApplication;

public class AppTest {

	public static void main(String[] args) {
		Developer d1=new Developer("pradnya",3,"Java Developement");
		
		DesktopApplication da1=new DesktopApplication(1.1,"spring",d1,101);
		System.out.println(da1);
		
		WebApplication w1=new WebApplication(1.1,"react",d1,102);
		System.out.println(w1);
		
		MobileApplication m1=new MobileApplication(5.6,"Android",d1,1245348542);
		System.out.println(m1);
	}

}
