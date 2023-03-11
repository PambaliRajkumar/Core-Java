package dependencyInjection.oneToMany.setterInjection;

public class Main {

	public static void main(String[] args) {
		
		//CREATING DEPENDENT OBJECT 
		Hero hero1 = new Hero();
		hero1.setName("NTR");
		hero1.setBestMovie("Ooseravelli");
		hero1.setNoOfMovies(35);
		
		//CREATING DEPENDENT OBJECT 
		Hero hero2 = new Hero();
		hero2.setName("CHARAN");
		hero2.setBestMovie("Orange");
		hero2.setNoOfMovies(10);
		Hero hero[]	= {hero1,hero2};
		
		Movie movie = new Movie();
		//INJECTING OF DEPENDENT ARRAY OF OBJECTS TO TARGET OBJECT THROUGH SETTER.
		movie.setHero(hero);
		movie.setDirector("Raja Mouli");
		movie.setMovie("RRR");
		
		System.out.println(movie);
	}

}
