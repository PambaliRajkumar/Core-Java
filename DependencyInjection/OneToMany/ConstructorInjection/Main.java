package dependencyInjection.oneToMany.constructorInjection;

public class Main {

	public static void main(String[] args) {
		
		//CREATING DEPENDENT OBJECT 
		Hero hero1 = new Hero("NTR","Ooseravelli",35);
		Hero hero2 = new Hero("CHARAN","Orange",10);
		Hero hero[]	= {hero1,hero2};
		
//		//INJECTING OF DEPENDENT ARRAY OF OBJECTS TO TARGET OBJECT THROUGH CONSTRUCTOR.
		Movie movie = new Movie("RRR", "Rajamouli", hero);
		
		System.out.println(movie);
	}

}
