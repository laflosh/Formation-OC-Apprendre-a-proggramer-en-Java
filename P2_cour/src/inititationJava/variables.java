package inititationJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class variables {

	public static void main(String[] args) {
		
		int epargne = 500;
		int revenus = 2000;
		
		final int NUMBEROFWEEKDAYS = 7;
		
		final String MESSAGE = "Hello world";
		
		epargne += 100;
		
		revenus -= 50;
		
		int nombreDeJoursEpargne = (5000 - revenus) / 500;
		
		revenus = revenus - (30 - 10) * 7;
		
		System.out.println("Mon délais d'épargne est de " + nombreDeJoursEpargne +" jours");
		
		String message = "Mon indemnité est de " + revenus;
		
		System.out.println(message);
		
		
		//exemple de piles de données (Penser aux imports)
		
		//tableau
		int[] cupsOfCoffeePerDayOfTheWeek=new int[]{6,2,3,7,3,4,1};
		
		// Créez un tableau multidimensionnel 
		String[][] myTheatreSeats = new String[30][12];
		myTheatreSeats[9][5] = "James Logan";
		
		//list
		List<Integer> myList = new ArrayList<Integer>(); // -> []
		
		myList.add(7); // -> [7]
		myList.add(5); //-> [7, 5]
		myList.add(1,12); //-> [7, 12, 5]
		myList.set(0,4); // -> [4, 12, 5]
		myList.remove(1); // removed 12 -> [4, 5]
		
		System.out.println(myList.size()); // -> 2
		
		//hashset, collection non ordonnées
		Set<String> ingredients = new HashSet<String>();
		
		ingredients.add("salt"); //ajoutez du sel sur les ingrédients
		ingredients.remove("salt"); //enlevez du sel des ingrédients
		
		//dictionnaire
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Jenny", 34);
		myMap.put("Livia", 28);
	}

}
