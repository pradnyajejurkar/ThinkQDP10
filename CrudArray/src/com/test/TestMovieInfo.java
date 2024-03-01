package com.test;

import java.util.List;
import java.util.Scanner;

import com.dao.MovieManager;
import com.pojo.Movie;



public class TestMovieInfo {
	
	    public static void main(String[] args) {
	    	
	         Scanner sc= new Scanner(System.in);

	    	 MovieManager m1 = new MovieManager();

	         while (true) {
	             System.out.println("1. Add Movie");
	             System.out.println("2. Update Movie");
	             System.out.println("3. Delete Movie");
	             System.out.println("4. Search Movie");
	             System.out.println("5. Show All Movies");
	             System.out.println("6. Sort Movies by Rating");
	             System.out.println("7.Book Movie");
	             System.out.println("8. Exit");
	             System.out.println("-----------------------------------");

	             System.out.print("Enter your choice: ");
	           //  int choice = sc.nextInt();
	             switch(sc.nextInt()) {

	 			case 1:
	 			{
	 				m1.addMovie();
	 				break;
	 			}
	 			case 2:
	 			{
	 				m1.updateMovie();
	 				break;
	 			}
	 			case 3:
	 			{
	 				m1.deleteMovie();
	 				break;
	 			}
	 			case 4:
	 			{
	 				m1.searchMovie();
	 				break;
	 			}
	 			
	 			case 5:
	 			{
	 				System.out.println("-----------------------------------");
	 				if(m1.showMovies().isEmpty())
	 				{
	 					System.out.println("List is Empty!");
	 				}else {
	 					for(Movie m:m1.showMovies()) {
	 						System.out.println(m);
	 					}
	 				}
	 				System.out.println("-----------------------------------");
	 				
	 				break;
	 			}
	 			case 6:
	 			{
	 				System.out.println("-----------------------------------");
	 				if(m1.sortMovieRatings().isEmpty())
	 				{
	 					System.out.println("List is Empty!");
	 				}else {
	 					for(Movie m:m1.showMovies()) {
	 						System.out.println("Movie Name:"+m.getMovieName()+", "+"Rating: "+m.getMovieRatings());
	 					}
	 				}
	 				System.out.println("-----------------------------------");
	 				
	 				break;
	 			}
	 			case 7:
	 			{
	 				
	 				m1.bookMovie();
	 				
	 				break;
	 			}
	 			case 8:
	 			{
	 				
	 				System.exit(0);
	 				break;
	 			}
	 			default:
	 				System.err.println("Invalid Input!");
	 			}
	 		}
	 	}
	 }
	             