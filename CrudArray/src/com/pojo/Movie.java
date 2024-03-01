package com.pojo;

public class Movie {

	
	    private int movieId;
	    private String movieName;
	    private double movieRatings;
	    private Character1 character;

	  
	    public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Movie(int movieId, String movieName, double movieRatings, Character1 character) {
	        this.movieId = movieId;
	        this.movieName = movieName;
	        this.movieRatings = movieRatings;
	        this.character = character;
	    }

	    
		 public int getMovieId() {
			return movieId;
		}

		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public double getMovieRatings() {
			return movieRatings;
		}

		public void setMovieRatings(double movieRatings) {
			this.movieRatings = movieRatings;
		}

		public Character1 getCharacter() {
			return character;
		}

		public void setCharacter(Character1 character) {
			this.character = character;
		}

		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRatings=" + movieRatings
					+ ", character=" + character + "]";
		}

		
}