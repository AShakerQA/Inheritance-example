package main;

public class Duck extends Animal{
	//Attributes
	public String name;
	
	//Constructors
	public Duck() {
		super();
		this.name = "???";
		System.out.println("I am a Duck!");
	}
	
	//Overloaded Constructor
	public Duck(String name) {
		super();
		System.out.println("Quack!");
	}
	
	public Duck(String species, int age, String colour, String name) {
		super(species, age, colour);
		this.name = name;
	}
	
	//Method
	public void fly() {
		System.out.println("The " + this.species + "is now flying.");
	}
	
	public void seekPartner() {
		System.out.println("The animal is searching for a mate.");
	}
}
