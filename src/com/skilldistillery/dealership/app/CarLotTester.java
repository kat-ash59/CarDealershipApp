package com.skilldistillery.dealership.app;
import com.skilldistillery.dealership.entities.CarLot;

public class CarLotTester 
{

	public void main(String[] args)
	{
		CarLot dealingDoogiesNewCarLot = new CarLot();
		String [] listOfCars;
		
		dealingDoogiesNewCarLot.addCar("Volvo", "V70 turbo", "Sortof Silverish", 599.99);
		dealingDoogiesNewCarLot.addCar("Ford", "Escape Hybrid", "Navy Blue", 24999.99);
		
		listOfCars = dealingDoogiesNewCarLot.getListOfCarsInInventory();
		
		printInventory(listOfCars);
		
		
		dealingDoogiesNewCarLot.addCar("Ford", "Pinto Pony", "Bronco Orange", 29.99);
		dealingDoogiesNewCarLot.addCar("Honda", "CRX", "Cherry Red", 999.99);
		
		printInventory(listOfCars);
		
	} // end main
	
	public static void printInventory(String[] listOfCars)
	{
		// print out inventory
		System.out.println("\n\nThe current inventory of cars at Dealing Doogies Car Lot is:\n");
		
		for(String car: listOfCars)
		{
			System.out.println("\t" + car);
		}
	} // end printInventory
	
	
} // end class CarLotTester
