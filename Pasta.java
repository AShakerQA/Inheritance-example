package main;

	public class Pasta extends Food{
		//Attributes
		
		//Constructors
		public Pasta() {
			super();
			System.out.println("Pasta is served!");
		}
		
		//Overloaded Constructor
		public Pasta(String name, String description) {
			super(name, description);
			
		}
		
		//Method
		@Override
		public int cost() {
			return 3;
		}
		
		
}
