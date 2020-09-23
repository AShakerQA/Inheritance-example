package main;

public class Burger extends Food{
	//Attributes
	
	//Constructors
	public Burger() {
		super();
		System.out.println("Burger incoming...");
	}
	
	//Overloaded Constructor 
	public Burger(String name, String description) {
		super(name, description);
	}
	
	//Method
	@Override
	public int cost() {
		return 8;
	}
	
}