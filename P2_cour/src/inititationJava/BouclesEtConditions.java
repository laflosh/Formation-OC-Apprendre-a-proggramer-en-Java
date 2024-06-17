package inititationJava;

public class BouclesEtConditions {

	public static void main(String[] args) {
		
		bonjour("Jean");
		
		//for loop
		for(int i = 1; i <= 100; i++) {
			
			bonjour(Integer.toString(i));
			
		}
		
		forEachLoop();
		
		//While loop
		int j = 0;
		
		while(j < 90 ) {
			
			j = randomNumber();
			
			print(j);
			
		}

	}
	
	public static void bonjour(String nom) {
		
		System.out.println("Bonjour " + nom + " !!");
		
	}
	
	public static void forEachLoop() {
		
		int[] myArray = new int[]{7,2,3,8,9};
		
		//for-each loop boucle for améliorer
		for(int nombre : myArray) {
			
			System.out.println(nombre);
			
		}
		
	}
	
	public static void print(int nombre) {
		
		System.out.println("Nombre: " + Integer.toString(nombre));
		
	}
	
	public static int randomNumber() {
		
		return (int)((Math.random() * ((100 - 1) + 1)) + 1);
		
	}

}
