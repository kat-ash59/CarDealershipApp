package com.skilldistillery.dealership.entities;

public class Car 
{
	   public String make;
	   public String model;
	   public String color;
	   public double purchasePrice;

	   public String getCarData() 
	   {
	      String output = "make=" + make + ", model=" + model + ", color=" + color + ", purchasePrice=" + purchasePrice;
	      return output;
	   } // end method getCarData

	   public void displayCar() 
	   {
	      String carData = getCarData();
	      System.out.println(carData);
	   } // end method displayCar

} // end class Car
