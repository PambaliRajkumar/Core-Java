package dependencyInjection.oneToMany.constructorInjection;

import java.util.Arrays;

//TARGET CLASS
public class Movie {
	private String movie;
	private String director;
	
	//HAS - A MANY (ONE TO MANY)
	Hero hero[];
	
	//INJECTING DEPENDENT OBJECT TO TARGET OBJECT THROUGH CONSTRUCTOR.
	public Movie(String movie, String director, Hero[] hero) {
		this.movie = movie;
		this.director = director;
		this.hero = hero;
	}

	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", director=" + director + ", hero=" + Arrays.toString(hero) + "]";
	}
	
	
	
	
}
