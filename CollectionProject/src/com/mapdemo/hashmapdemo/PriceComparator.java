package com.mapdemo.hashmapdemo;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order>{

		@Override
		public int compare(Order o1, Order o2) {
			
			return (int) (o2.getCost()-o1.getCost());
		}
		

	}


