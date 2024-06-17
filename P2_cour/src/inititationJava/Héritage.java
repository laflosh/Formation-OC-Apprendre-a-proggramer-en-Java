package inititationJava;

public class Héritage {

	public static void main(String[] args) {
		
		FigureGeometrique figure = new FigureGeometrique(2,3);
		figure.moveTo(1, 1);
		
		Carre carre = new Carre(4,6,8);
		carre.moveTo(2, 2);

	}
	
	public static class FigureGeometrique {
		
		private int x;
		private int y;
		
		public FigureGeometrique(int x, int y) {
			
			this.x = x;
			this.y = y;
			
		}
		
		public void moveTo(int newX, int newY) {
			
			this.x = newX;
			this.y = newY;
			
		}
		
	}
	
	public static class Carre extends FigureGeometrique{
		
		private long cote;
		
		public Carre(long cote, int x, int y) {
			
			super(x,y);
			this.cote = cote;
			
		}
		
		public long getCote() {
			return cote;
			
		}
		
		public long getPerimetre() {
			
			return 4 * cote;
			
		}
		
	}

}
