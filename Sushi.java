package main;

public class Sushi extends Food{
	//Attributes
	
	//Constructors
	public Sushi() {
		super();
		System.out.println("Order for Sushi is ready!");
	}
	
	//Overloaded Constructor 
	public Sushi(String name, String description) {
		super(name, description);
	}
	
	//Method
	@Override
	public int cost() {
		return 5;
	}
	
}

