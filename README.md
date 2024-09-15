# CarDealershipApp


### Description



### Technologies used
Java



### Lessons Learned


Check List of items to work on:
1) Create a new Java project DealingDoogieDealership.
completed 09/14/2024

2)  Create 2 new Java packages: com.skilldistillery.dealership.app and com.skilldistillery.dealership.entities
complete 09/14/2024

3) Find and copy your previously created Car class (or copy the Car class below) into package com.skilldistillery.dealership.entities.
complete 09/14/2024

4) Copy the below CarTester into com.skilldistillery.dealership.app.
complete 09/14/2024


5) The CarTester class is hurling errors.
CarTester can't find your Car class.

Fix the issue -  had to add import (import com.skilldistillery.dealership.entities.*;)
complete 09/14/2024 

6)  Change the Car class's fields to have private visibility.
	when made pirvate CarTester.java threw errors on the following lines of cofe 
		fredsCar.make = "Kia";
	    fredsCar.model = "Sportage";
	    fredsCar.color = "Hot Pink";
	    fredsCar.purchasePrice = 28565;
	    --
	    bernicesCar.make = "Toyota";
	    bernicesCar.model = "Prius";
	    bernicesCar.color = "Neon";
	    bernicesCar.purchasePrice = 32199;
	--    
	Add getters and setters for the fields.
		need to use these to fix errors from making private parts
	Add a constructor with parameters for all 4 fields.
	Add a no-arg constructor.
	Change the name of the method getCarData to toString (because it is not a getter by convention).
	Fix the syntax error caused by step 5.
			to fix had to change
			     in Car.java
			     	displayCar() method to call toString instead of getCarData
			     in CarTester.java
			     	String fredCarData = fredsCar.getCarData(); -- need to use toString instead of getCarData
	    			String bernicesCarData = bernicesCar.getCarData();  -- need to use toString instead of getCarData
complete 09/14/2024 

7) Copy the below CarTester into com.skilldistillery.dealership.app.
got a bit ahead and did this earlier complete 09/14/2024 fixed errors as noted above in step 6
checked code into github
     
