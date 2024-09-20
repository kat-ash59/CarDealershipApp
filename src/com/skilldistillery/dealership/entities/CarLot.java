package com.skilldistillery.dealership.entities;

public class CarLot 
{
	private static int MAX_CARS = 10;
	private int currentNumberOfCarsInInventory;
	private Car[] carsInInventory = new Car[MAX_CARS];
	private String carInformation = new Car().toString();
	
	
	// no arg constructor
	public CarLot ()
	{
		System.out.println("\n\nHere at Dealing Doogie we welcome you to our car lot!\n");
	} // end no arg constructor
	
	private int findSpecificModelCarInLot(String desiredMake, String desiredModel)
	{
		int inventoryNumber = -1;
		Car testCar = carsInInventory[0];	
		
		String testMake = testCar.getMake();
		String testDesiredModel = testCar.getModel();
		
		System.out.println("test make = " + testMake);
		System.out.println("test model = " + testDesiredModel);
		
		for (int i = 0; i < currentNumberOfCarsInInventory; i++)
		{
			if (testMake.equals(desiredMake) && testDesiredModel.equals(desiredModel))
			{
				inventoryNumber = i;
				break;
			}
			else
			{
				testCar = carsInInventory[i + 1];
				testMake = testCar.getMake();
				testDesiredModel = testCar.getModel();
			}
			
		} // end for loop
		
		return inventoryNumber;
	} // end method findSpecificModelCarInLot
	
	public int isCarInInventory(String make, String model)
	{
		int inventoryNumber = findSpecificModelCarInLot(make, model);
		
		return inventoryNumber;
		
	} // end method isCarInInventory

	public String addCar(Car newCarForInventory)
	{
		String carInformationString;

		// need to increase so don't overwrite
		System.out.println("inside add car");
		System.out.println("currentNumberOfCarsInInventory = " + currentNumberOfCarsInInventory);

		if ((currentNumberOfCarsInInventory != 0) && (currentNumberOfCarsInInventory < MAX_CARS))
		{
			currentNumberOfCarsInInventory++; 
		}
		
		newCarForInventory.toString();
		System.out.println(newCarForInventory.toString() + "\nafter print new car to add information");
		carsInInventory[currentNumberOfCarsInInventory].setMake(newCarForInventory.getMake());
		carsInInventory[currentNumberOfCarsInInventory].setModel(newCarForInventory.getModel());
		carsInInventory[currentNumberOfCarsInInventory].setColor(newCarForInventory.getColor());
		carsInInventory[currentNumberOfCarsInInventory].setPurchasePrice(newCarForInventory.getPurchasePrice());
		carInformationString = this.carsInInventory[currentNumberOfCarsInInventory].toString();
		return (carInformationString);   
	} // end method addCar with just car information
	
	public String addCar(String make, String model, String color, double purchasePrice)
	{
		String carInformationString;
		
		// need to make sure that it isn't the first car in lot and not exceeding max cars in lot
		if ((currentNumberOfCarsInInventory != 0) && (currentNumberOfCarsInInventory < MAX_CARS))
		{
			currentNumberOfCarsInInventory++; 
		}
		
		this.carsInInventory[currentNumberOfCarsInInventory].setMake(make);
		this.carsInInventory[currentNumberOfCarsInInventory].setModel(model);
		this.carsInInventory[currentNumberOfCarsInInventory].setColor(color);
		this.carsInInventory[currentNumberOfCarsInInventory].setPurchasePrice(purchasePrice);
		carInformationString = this.carsInInventory[currentNumberOfCarsInInventory].toString();
		currentNumberOfCarsInInventory++; // need to increase so don't overwrite
		// System.out.println("You just added this car to inventory " + carInformation.toString());
		return (carInformationString);                   					
				
	} // end method addCar which added a new car to inventory with individual parts

	public static int getMAX_CARS() {
		return MAX_CARS;
	}  // end getMaxCars


	public int getCurrentNumberOfCarsInInventory() 
	{
		return currentNumberOfCarsInInventory;
	} // end getCurrentNumberOfCarsInInventory

	public void setCurrentNumberOfCarsInInventory(int currentNumberOfCarsInInventory) {
		this.currentNumberOfCarsInInventory = currentNumberOfCarsInInventory;
	}

	public String[] getListOfCarsInInventory()
	{
		String[] listOfCars = new String[currentNumberOfCarsInInventory];
		
		for (int i = 0; i <= currentNumberOfCarsInInventory; i++)
		{
			listOfCars[i] = this.carsInInventory[i].toString();
		}
		
		return listOfCars;
	}
	
	public int getNumberOfCarsInInventory()
	{
		return this.currentNumberOfCarsInInventory;
	} // end getNumberOfCarsInInventory
	
	public Car getCar(int carsPositionInLot)
	{
		return this.carsInInventory[carsPositionInLot];
	}
} // end class CarLot
