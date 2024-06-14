package inititationJava;

public class PorterVariables {

	public static void main(String[] args) {
		
		EnsembleFonction.fonction1();
		//EnsembleFonction.fonction2(); plus accéssible
		
	}
	
}
	
class EnsembleFonction {
	
	static String exemple = "Hello";
	
	public static void fonction1() {
		
		System.out.println(exemple);
		
	}
	
	private static void fonction2() {
		
		exemple = exemple.toUpperCase();
		String exemple2 = " world";
		System.out.println(exemple + exemple2);
		
	}
}
