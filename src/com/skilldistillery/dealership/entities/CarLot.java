package com.skilldistillery.dealership.entities;

public class CarLot 
{
	private static int MAX_CARS = 10;
	private int currentNumberOfCarsInInventory;
	private String[] carsInInventory = new String[MAX_CARS];
	private Car carInformation = new Car();
	
	
	// no arg constructor
	public CarLot()
	{
		System.out.println("\n\nHere at Dealing Doogie we welcome you to our car lot!\n");
	} // end no arg constructor
	
	public String addCar(String make, String model, String color, double purchasePrice)
	{
		currentNumberOfCarsInInventory++; // need to increase so don't overwrite
		this.carInformation.setMake(make);
		this.carInformation.setModel(model);
		this.carInformation.setColor(color);
		this.carInformation.setPurchasePrice(purchasePrice);
		carsInInventory[currentNumberOfCarsInInventory] = carInformation.toString();
		return ("You have just added this wonderful car to our inventory here at Dealing Doogies Car Lot \n\t" +
				carInformation.toString());                   					
				
	} // end method addCar which added a new car to inventory
	
	public String[] getListOfCarsInInventory()
	{
		return carsInInventory;
	} // end method getListOfCarsInInventory
	
	public int getNumberOfCarsInInventory()
	{
		return currentNumberOfCarsInInventory;
	}
	

} // end class CarLot
