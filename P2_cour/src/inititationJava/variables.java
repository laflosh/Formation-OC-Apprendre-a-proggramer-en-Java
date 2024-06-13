package inititationJava;

public class variables {

	public static void main(String[] args) {
		
		int epargne = 500;
		int revenus = 2000;
		
		epargne += 100;
		
		revenus -= 50;
		
		int nombreDeJoursEpargne = (5000 - revenus) / 500;
		
		revenus = revenus - (30 - 10) * 7;
		
		System.out.println("Mon délais d'épargne est de " + nombreDeJoursEpargne +" jours");
		
		String message = "Mon indemnité est de " + revenus;
		
		System.out.println(message);
		
		final int NUMBEROFWEEKDAYS = 7;
		
		final String MESSAGE = "Hello world";

	}

}
