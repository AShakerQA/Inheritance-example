package main;

import java.util.ArrayList;

public class Food {
	//Attributes
	protected String name;
	protected String description;
	
	//Constructors
	public Food() {
		this("???", "???");
	}
	//Overloaded Constructor
	public Food(String name, String description) {
		this.name  = name;
		this.description = description; 
	}
	
	//Methods
	public int cost() {
		return 2;
	}
	
	public static void main(String[] args) {
		//functionality
	Food lagsane = new Pasta("lagsane", "saucy");
	//lagsane.cost(); - check if override works
	
	Food nigiriRoll = new Sushi("nigiriRoll", "spicy"); //can be initialised empty for task
	Food beefBurger = new Burger("qpBeef", "filling");
	
	//one instance of a non defined food;
	Food food1 = new Food();
	//ArrayList called Menu, type Food(class)
	ArrayList<Food> Menu = new ArrayList<>();
	
	Menu.add(nigiriRoll);
	Menu.add(beefBurger);
	Menu.add(lagsane);
	Menu.add(food1);
	
	//print cost of each Food item in menu array
	float sum = 0f;
	for (Food obj : Menu) {
		//System.out.println(obj.cost());
		sum += obj.cost();
		//print total cost() of Food
		System.out.println(sum);
	}
	
	}
	
	
	
	
	
	
}
