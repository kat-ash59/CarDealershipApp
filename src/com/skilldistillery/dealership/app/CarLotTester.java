package com.skilldistillery.dealership.app;
import com.skilldistillery.dealership.entities.*;

public class CarLotTester 
{
	

	public static void main(String[] args)
	{

		// System.out.println("inside main of CarLotTester");
		run();
		
	} // end main
	
	public static void printInventory(String[] listOfCars, int numCars)
	{
		// print out inventory
		System.out.println("\n\nThe current inventory of cars at Dealing Doogies Car Lot is:\n");
		// System.out.println("numCars = " + numCars);
		
		for (int i = 0; i < numCars; i++)
		{
			System.out.println("\t" + listOfCars[i]);
		}
	} // end printInventory
	
	public static Car buildCarInfoForInventory (String make, String model, String color, double purchasePrice)
	{
		System.out.println("inside carlottester build car for Inventory");
		Car newCarAddToInventory = new Car(make, model, color, purchasePrice);
		return (newCarAddToInventory);
	}
	
	public static void run()
	{
		CarLot dealingDoogiesNewCarLot = new CarLot();
		String [] listOfCars;
		int currentNumberOfCarsInLot;
		int whereIsCarOnLot;
		Car newCarForInventory = new Car();
		String carInInventory = null;
		Car carToCheck = new Car();
		
		System.out.println("before add first car");
		newCarForInventory = buildCarInfoForInventory("Volvo", "V70 turbo", "Sortof Silverish", 599.99);
		System.out.println("after build car for Inventory");
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		System.out.println("after addCar");
		
		
		newCarForInventory = buildCarInfoForInventory("Ford", "Escape Hybrid", "Navy Blue", 24999.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		
		listOfCars = dealingDoogiesNewCarLot.getListOfCarsInInventory();
		currentNumberOfCarsInLot = dealingDoogiesNewCarLot.getNumberOfCarsInInventory();
		
		printInventory(listOfCars, currentNumberOfCarsInLot);
		
		
		newCarForInventory = buildCarInfoForInventory("Ford", "Pinto Pony", "Bronco Orange", 29.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		
		newCarForInventory = buildCarInfoForInventory("Honda", "CRX", "Cherry Red", 999.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);

		listOfCars = dealingDoogiesNewCarLot.getListOfCarsInInventory();
		currentNumberOfCarsInLot = dealingDoogiesNewCarLot.getCurrentNumberOfCarsInInventory();

		printInventory(listOfCars,currentNumberOfCarsInLot);
		
		whereIsCarOnLot = dealingDoogiesNewCarLot.isCarInInventory("Volvo", "V70");
		carToCheck = dealingDoogiesNewCarLot.getCar(whereIsCarOnLot);
		System.out.println("car in Inventory " + carToCheck.toString());
		
		
		
		
	}
	
} // end class CarLotTester
