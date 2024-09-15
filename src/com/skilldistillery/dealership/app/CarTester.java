package com.skilldistillery.dealership.app;
import com.skilldistillery.dealership.entities.*;

public class CarTester 
{

	  public static void main(String[] args) 
	  {
	    // Create two Cars and assign fields
	    Car fredsCar = new Car();
	    fredsCar.setMake("Kia");
	    fredsCar.setModel("Sportage");
	    fredsCar.setColor("Hot Pink");
	    fredsCar.setPurchasePrice(28565.99);

	    Car bernicesCar = new Car();

	    bernicesCar.setMake("Toyota");
	    bernicesCar.setModel("Prius");
	    bernicesCar.setColor("Neon Green");
	    bernicesCar.setPurchasePrice(32199.99);

	    // Have the cars display themselves
	    fredsCar.displayCar();
	    bernicesCar.displayCar();
	    System.out.println();

	    String fredCarData = fredsCar.toString();
	    String bernicesCarData = bernicesCar.toString();

	    // Get the cars' data and display that
	    System.out.println("Fred car data: " + fredCarData + "\n");
	    System.out.println("Bernices Car data: " + bernicesCarData + "\n");
	    
	  } // end main

} // end class CarTester