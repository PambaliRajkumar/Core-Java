package dependencyInjection.oneToOne.constructorInjection;

public class Main {

	public static void main(String[] args) {
		
		//CREATING DEPENDENT OBJECT 
		Hero hero = new Hero("PawanKalyan","Gabbar Singh",25);
		
		//INJECTING OF DEPENDENT OBJECT TO TARGET OBJECT THROUGH CONSTRUCTOR.
		Movie movie = new Movie("Sardar Gabbar Singh", "Kajal", "Bobby", hero);
		
		System.out.println(movie);
	}

}
