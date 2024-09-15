package com.skilldistillery.dealership.entities;

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
	   
	   
	   public void setMake (String make)
	   {
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
