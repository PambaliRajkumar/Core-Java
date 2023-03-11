package dependencyInjection.oneToOne.setterInjection;

//TARGET CLASS
public class Movie {
	private String movie;
	private String actress;
	private String director;
	
	//HAS - A (ONE TO ONE)
	Hero hero;
	
	//INJECTING DEPENDENT OBJECT TO TARGET OBJECT THROUGH SETTER.
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movie [movie=" + movie + ", actress=" + actress + ", director=" + director + ", hero=" +hero.toString()+ "]";
	}
	
}
