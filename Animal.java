package main;

public class Animal {
	//Attributes
	protected String species;
	protected int age;
	protected String colour;
	
	//Constructors
	public Animal() {
		this("???", 1, "???");
	}
	
	
	public Animal(String species, int age, String colour) {
		this.species = species;
		this.age = age;
		this.colour = colour;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Duck duck1 = new Duck("American Black", 2, "black", "Daffy");
		
		System.out.println("My Duck name is: " + duck1.name);
		
		Dragon dragon1 = new Dragon("tyan", true);
		dragon1.roar();
		
		}
	
		//polymorphism allows a method from super class to be 
		//redefined in the sub class for more functionality/different
}		//requires @override
