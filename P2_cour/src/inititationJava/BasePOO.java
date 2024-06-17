package inititationJava;

public class BasePOO {

	public static void main(String[] args) {
		
		Book myBook = new Book("Le swag dans les veines","Florent Lecointre", 350);
		
		System.out.println(myBook.title);
		System.out.println(myBook.author);
		System.out.println(myBook.numberOfPages);
		System.out.println(myBook.publisher);

	}
	
	//exemple de class
	public static class Book {
		
		String title;
		
		String author;
		
		int numberOfPages;
		
		String publisher;
		
		//Constructeur secondaire de la class Book
		public Book(String title, String author, int numberOfPages){
			
			this(title, author, numberOfPages, "Florent Lecointre");
			
		}
		
		//Constructeur principal de la class Book
		public Book(String title, String author, int numberOfPages, String publisher) {
			
			this.title = title;
			this.author = author;
			this.numberOfPages = numberOfPages;
			this.publisher = publisher;
			
		}
		
	}

}
