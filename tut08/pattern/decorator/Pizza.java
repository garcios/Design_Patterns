package tut08.pattern.decorator;

//Blueprint for classes that will have decorators

public interface Pizza {
	
	public String getDescription();
	
	public double getCost();
	
}



abstract class Pizza2{

	
	public abstract void setDescription(String newDescription);
	public abstract String getDescription();
	
	public abstract void setCost(double newCost);
	public abstract double getCost();
	
	// I could use getter and setter methods for every 
	// potential Pizza topping
	
}