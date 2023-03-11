package dependencyInjection.oneToOne.constructorInjection;

//TARGET CLASS
public class Movie {
	private String movie;
	private String actress;
	private String director;
	//HAS - A (ONE TO ONE)
	Hero hero;
	//INJECTING DEPENDENT OBJECT TO TARGET OBJECT THROUGH CONSTRUCTOR.
	public Movie(String movie, String actress, String director, Hero hero) {
		this.movie = movie;
		this.actress = actress;
		this.director = director;
		this.hero = hero;
	}
	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", actress=" + actress + ", director=" + director + ", hero=" +hero.toString()+ "]";
	}
	
}
