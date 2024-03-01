package com.vectordemo;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeIterator {

	public static void main(String[] args) {

		Vector<Integer> v1=new Vector<>();
		
		v1.add(8);
		v1.add(5);
		v1.add(8);
		v1.add(8);
		v1.add(-34);
		v1.add(23);
		
		System.out.println(v1);
		
		Enumeration<Integer> en=v1.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement()== -34) 
				v1.add(37);
			}
			System.out.println(v1);
		}

	}


