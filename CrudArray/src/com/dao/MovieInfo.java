package com.dao;

import java.util.List;

import com.pojo.Movie;
public interface MovieInfo {

	
	    void addMovie();
	    void updateMovie();
	    void deleteMovie();
	    void searchMovie();
	    List<Movie> showMovies();
	    
	    void bookMovie();
		List<Movie> sortMovieRatings();
	}


