package dependencyInjection.oneToMany.setterInjection;

import java.util.Arrays;

//TARGET CLASS
public class Movie {
	private String movie;
	private String director;
	
	//HAS - A MANY (ONE TO MANY)
	Hero hero[];
	
	

	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", director=" + director + ", hero=" + Arrays.toString(hero) + "]";
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	//INJECTING DEPENDENT OBJECT TO TARGET OBJECT THROUGH SETTER.
	public void setHero(Hero[] hero) {
		this.hero = hero;
	}
	
	
	
	
}
