package com.skilldistillery.dealership.entities;

/*
 * for car lot,
 * Create a private field to hold the cars. What data structure will you use to hold all 10 Cars? array of cars
 * Create a private field that tracks how many cars are currently parked in the lot.
 *  Create a no-arg constructor. 
 */
public class CarLot 
{
	private static int MAX_CARS = 10;
	private static Car[] carsInInventory = new Car[MAX_CARS]; // need to make it an array now
	private int currentNumberOfCarsInInventory;
	private Car carInformation = new Car();
	
	
	// no arg constructor
	public CarLot()
	{
		System.out.println("\n\nHere at Dealing Doogie we welcome you to our car lot!\n");
	} // end no arg constructor
	
	public void addCar(Car newCarForInventory)
	{
		// need to check to see how many cars are currently in inventory currently not dry will need to add method here
		carsInInventory[currentNumberOfCarsInInventory] = newCarForInventory;
		
		// need to check if first car was added and increase currentNumberOfCarsInInventory by 1
		if (currentNumberOfCarsInInventory == 0)
		{
			currentNumberOfCarsInInventory++;
		}
		else if ((currentNumberOfCarsInInventory != 0) && (currentNumberOfCarsInInventory < MAX_CARS))
		{
			currentNumberOfCarsInInventory++; // need to increase so don't overwrite
		}
		
		
	}
	
	public void addCar(String make, String model, String color, double purchasePrice)
	{
		
		this.carInformation.setMake(make);
		this.carInformation.setModel(model);
		this.carInformation.setColor(color);
		this.carInformation.setPurchasePrice(purchasePrice);
		
		carsInInventory[currentNumberOfCarsInInventory] = this.carInformation;

		// need to check if first car was added and increase currentNumberOfCarsInInventory by 1
		if (currentNumberOfCarsInInventory == 0)
		{
			currentNumberOfCarsInInventory++;
		}
		else if ((currentNumberOfCarsInInventory != 0) && (currentNumberOfCarsInInventory < MAX_CARS))
		{
			currentNumberOfCarsInInventory++; // need to increase so don't overwrite
		}
						
	} // end method addCar which added a new car to inventory
	
	
	
	public Car[] getListOfCarsInInventory()
	{
		return this.carsInInventory;
	} // end method getListOfCarsInInventory
	
	public int getNumberOfCarsInInventory()
	{
		return this.currentNumberOfCarsInInventory;
	} // end method getNumberOfCarsInInventory
	
	public int setNumberOfCarsInInventory(int numCars)
	{
		// need to check to see how many cars are currently in inventory currently 
		if ((currentNumberOfCarsInInventory != 0) && (currentNumberOfCarsInInventory < MAX_CARS))
		{
					this.currentNumberOfCarsInInventory = numCars;
		}
		return this.currentNumberOfCarsInInventory;
		
	} // end method setNumberOfCarsInInventory
	
	
	public static void printInventory(int numCars)
	{
		// print out inventory
		System.out.println("\n\nThe current inventory of cars at Dealing Doogies Car Lot is:\n");
		String carInformation;
	
		for (int i = 0; i < numCars; i++)
		{
			carInformation =  carsInInventory[i].toString();
			System.out.println("\t" + carInformation);
		}
		System.out.println("\n\n");
		
	} // end printInventory
	

} // end class CarLot
