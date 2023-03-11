package dependencyInjection.oneToOne.setterInjection;

//DEPENDENT CLASS
public class Hero {
	private String name;
	private String bestMovie;
	private Integer noOfMovies;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBestMovie(String bestMovie) {
		this.bestMovie = bestMovie;
	}

	public void setNoOfMovies(Integer noOfMovies) {
		this.noOfMovies = noOfMovies;
	}
	
	@Override
	public String toString() {
		return "\nHero [name=" + name + ", bestMovie=" + bestMovie + ", noOfMovies=" + noOfMovies + "]";
	}

}
