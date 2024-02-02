package com.oops.constructeroverload;

import java.util.Scanner;

public class CricketerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerid;
		String name;
		boolean isBaller;
		float strikerate;
		int runs;

		System.out.println("Enter the playerid:");
		playerid = sc.nextInt();

		System.out.println("Enter the name:");
		name = sc.next();

		System.out.println("is a baller");
		isBaller = sc.nextBoolean();

		System.out.println("Enter the strikerate:");
		strikerate = sc.nextFloat();

		System.out.println("Enter the runs:");
		runs = sc.nextInt();

		Cricketer c1 = new Cricketer( playerid, name, isBaller, strikerate,runs);
		System.out.println(c1.getPlayerid());
		System.out.println(c1.getName());
		System.out.println(c1.getIsBaller());
		System.out.println(c1.getStrikerate());
		System.out.println(c1.getRuns());
		
		Cricketer c2 = new Cricketer(playerid, name, isBaller, strikerate,runs);
		System.out.println(c2.getPlayerid());
		System.out.println(c2.getName());
		System.out.println(c2.getIsBaller());
		System.out.println(c2.getStrikerate());
		System.out.println(c2.getRuns());
		
		Cricketer c3 = new Cricketer(playerid, name, isBaller, strikerate,runs);
		System.out.println(c3.getPlayerid());
		System.out.println(c3.getName());
		System.out.println(c3.getIsBaller());
		System.out.println(c3.getStrikerate());
		System.out.println(c3.getRuns());
	}

}
