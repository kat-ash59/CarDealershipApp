package com.skilldistillery.dealership.entities;

import java.util.Collections;

public class Car 
{
	   private String make;
	   private String model;
	   private String color;
	   private double purchasePrice;
	   
	   public Car(String make, String model, String color, double purchasePrice)
	   {
		   this.make = make;
		   this.model = model;
		   this.color = color;
		   this.purchasePrice = purchasePrice;
	   } // end constructor with all four fields as input
	   
	   // setting up constructor with no args and going to give it some default data
	   public Car()
	   {
		   this.make = "Volvo";
		   this.model = "V70 - Turbo";
		   this.color = "Silverish";
		   this.purchasePrice = 599.99;
	   } // end constructor with no args setting default values

	   @Override
	   public String toString() 
	   {
	      String output = "make=" + make + ", model=" + model + ", color=" + color + ", purchasePrice=" + purchasePrice;
	      return output;
	   } // end method getCarData
	   
	   public void displayCar() 
	   {
	      String carData = toString();
	      System.out.println(carData);
	   } // end method displayCar
	   
	   public String getMake()
	   {
		   return this.make;
	   } // end method getMake
	   
	   public String getMake (Car carInformation)
	   {
		   String carsMake;
		   carsMake = carInformation.getMake();
		   return carsMake;
	   }
	   
	   public String getMake(String carInformation)
	   {
		  String carMake = "default information in getMake";
		  
		  String[] breakCarInformationIntoParts = carInformation.split(",");
		  int numItemsInArray = Collections.frequency(null, breakCarInformationIntoParts);
		  
		  // going to print out breakCarInformationIntoParts
		  for (int i = 0; i < numItemsInArray; i++)
		  {
			  System.out.println("car information " + breakCarInformationIntoParts[i]);
		  }
		  return carMake; 	  
	   } // end getMake
	   
	   
	   public void setMake (String make)
	   {
		   System.out.println("inside car setMake");
		   this.make = make;
	   } // end setMake method
	   
	   
	   public String getModel()
	   {
		   return this.model;
	   } // end method getMake
	   
	   
	   public void setModel(String model)
	   {
		   this.model = model;
	   } // end setModel method
	   
	   public String getColor()
	   {
		   return this.color;
	   } // end method getColor
	   
	   
	   public void setColor(String color)
	   {
		   this.color = color;
	   } // end setColor method
	   
	   public double getPurchasePrice()
	   {
		   return this.purchasePrice;
	   } // end method getPurchasePrice
	   
	   
	   public void setPurchasePrice(double purchasePrice)
	   {
		   this.purchasePrice = purchasePrice;
	   } // end setPurchasePrice method
	   
	   

} // end class Car
