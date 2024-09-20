package com.skilldistillery.dealership.app;
import com.skilldistillery.dealership.entities.*;

public class CarLotTester 
{

	public static void main(String[] args)
	{

		// System.out.println("inside main of CarLotTester");
		run();
		
	} // end main
	
	
	public static Car buildCarInfoForInventory (String make, String model, String color, double purchasePrice)
	{
		Car newCarAddToInventory = new Car(make, model, color, purchasePrice);
		return (newCarAddToInventory);
	}
	
	public static void run()
	{
		CarLot dealingDoogiesNewCarLot = new CarLot();
		int numCars;
		Car newCarForInventory = new Car();
		
		
		
		newCarForInventory = buildCarInfoForInventory("Volvo", "V70 turbo", "Sortof Silverish", 599.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		numCars = dealingDoogiesNewCarLot.getNumberOfCarsInInventory();
		
		newCarForInventory = buildCarInfoForInventory("Ford", "Escape Hybrid", "Navy Blue", 24999.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		
		numCars = dealingDoogiesNewCarLot.getNumberOfCarsInInventory();
		dealingDoogiesNewCarLot.printInventory(numCars);
		
		
		newCarForInventory = buildCarInfoForInventory("Ford", "Pinto Pony", "Bronco Orange", 29.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		
		numCars = dealingDoogiesNewCarLot.getNumberOfCarsInInventory();
		
		newCarForInventory = buildCarInfoForInventory("Honda", "CRX", "Cherry Red", 999.99);
		dealingDoogiesNewCarLot.addCar(newCarForInventory);
		
		numCars = dealingDoogiesNewCarLot.getNumberOfCarsInInventory();
		dealingDoogiesNewCarLot.printInventory(numCars);
		
	}
	
} // end class CarLotTester
