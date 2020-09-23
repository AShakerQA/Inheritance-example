package main;

public class Dragon extends Animal{
	//Attributes
	public String name;
	public boolean breatheFire;
	
	//Constructors
	public Dragon() {
		super();
		this.name = "???";
		this.breatheFire = true;
		System.out.println("I am a mythical Dragon");
	}
	
	//Overloaded Constructor
	public Dragon(String name, boolean breatheFire) {
		super();
		this.name = name;
		this.breatheFire = breatheFire; 
		System.out.println("ROAR!");
	}
	
	public Dragon(String species, int age, String colour, String name, boolean breatheFire) {
		super(species, age, colour);
		this.name = name;
		this.breatheFire = breatheFire;
	}
	
	//Method
	public void roar() {
		System.out.println(this.name + " cries a loud ROAD");
	}
}
