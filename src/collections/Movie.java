package collections;

import java.util.ArrayList;
import java.util.Collections;



public class Movie implements Comparable<Movie>{

	private String name;
	private int year;
	private double rating;
	
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	
	public Movie(String name, double rating, int year)
	{
		this.name=name;
		this.year=year;
		this.rating = rating;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 3.4, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
		

        Collections.sort(list);
        
        System.out.println("Movies after sorting with year");
        for(Movie movie: list)
        {
        	System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }
        System.out.println();
        
        
        RatingCompare rating = new RatingCompare();
        Collections.sort(list, rating);
        
        System.out.println("Movies after sorting with Rating");
        
        for(Movie movie: list)
        {
        	System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }
        
        System.out.println();
        
        NameCompare name = new NameCompare();
        Collections.sort(list, name);
        
        System.out.println("Movies after sorting with name");
        
        for(Movie movie: list)
        {
        	System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }

	}

}
