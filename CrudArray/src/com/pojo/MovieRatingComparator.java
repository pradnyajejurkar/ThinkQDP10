package com.pojo;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
	
		//return o1.getMovieRatings().compareTo(o2.getMovieRatings());
		return (int) ((o1.getMovieRatings())-(o2.getMovieRatings()));
	}
	}
	
	
		


