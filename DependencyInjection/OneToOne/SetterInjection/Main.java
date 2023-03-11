package dependencyInjection.oneToOne.setterInjection;

public class Main {

	public static void main(String[] args) {
		
		//CREATING DEPENDENT OBJECT 
		Hero hero = new Hero();
		hero.setBestMovie("Gabbar Singh");
		hero.setName("PawanKalyan");
		hero.setNoOfMovies(25);
		
		Movie movie = new Movie();
		
		//INJECTING OF DEPENDENT OBJECT TO TARGET OBJECT THROUGH SETTER.
		movie.setHero(hero);
		movie.setActress("Kajal");
		movie.setDirector("Bobby");
		movie.setMovie("Sardaar Gabbar Singh");
		
		System.out.println(movie);
	}

}
