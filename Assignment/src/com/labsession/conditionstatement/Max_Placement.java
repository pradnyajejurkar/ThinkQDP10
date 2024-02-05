package com.labsession.conditionstatement;

import java.util.Scanner;

public class Max_Placement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		int CE,IT,MECH;
		System.out.println("Enter the total placements in CE:");
		CE=sc.nextInt();
		
		System.out.println("Enter the total placements in IT:");
		IT=sc.nextInt();
		
		System.out.println("Enter the total placements in MECH:");
		MECH=sc.nextInt();
		
		if(CE>0 && IT>0 && MECH>0) {
		   if(CE>IT && CE>MECH) {
			   System.out.println("  CE placements are Max ");
		   }
		   else if(IT>CE && IT>MECH) {
			   System.out.println("  IT placements are Max ");
		   }
		   else if(MECH>IT && MECH>CE) {
			   System.out.println("  MECH placements are Max ");
		   }
		   else if(CE==IT || CE>MECH) {
			   System.out.println(" Highest placements in CE ");
			   System.out.println(" Highest placements in IT");
			   
		   }
		}
	}

}
