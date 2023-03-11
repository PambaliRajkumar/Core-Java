package dependencyInjection.oneToMany.constructorInjection;

//DEPENDENT CLASS
public class Hero {
	private String name;
	private String bestMovie;
	private Integer noOfMovies;
	
	
	@Override
	public String toString() {
		return "\nHero [name=" + name + ", bestMovie=" + bestMovie + ", noOfMovies=" + noOfMovies + "]";
	}


	public Hero(String name, String bestMovie, Integer noOfMovies) {
		this.name = name;
		this.bestMovie = bestMovie;
		this.noOfMovies = noOfMovies;
	}
	
}
