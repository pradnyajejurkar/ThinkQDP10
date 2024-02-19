package com.arraylistdemo;

import java.util.ArrayList;


public class ReverseArrayList {

	static void reverseList(ArrayList<Double> al) {
		for (int i = 0, j = al.size() - 1; i < al.size() / 2; i++, j--) {
			double temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);

		}

	}

	public static void main(String[] args) {
		ArrayList<Double> marks = new ArrayList<>();
		marks.add(90.5);
		marks.add(56.4);
		marks.add(56.4);
		marks.add(78.5);
		// marks.add(null);
		marks.add(100.0);
		marks.add(85.0);

         System.out.println("Before:"+marks);
		
        reverseList(marks);
		
		
		System.out.println("After:"+marks);
	}

		
		
	}


