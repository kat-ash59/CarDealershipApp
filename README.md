# CarDealershipApp


### Description

This application is a standard application being run from the command line.  It is created to 

### Technologies used
Java



### Lessons Learned
weird stuff with line spacing in Readme.md due to markup language - need to learn more about this so can add indents and other stuff will 

Always Always Always add print statments to figure out what the heck is going on with the code, it is a fantastic debugging too

write it out in english first then write the code helps in more ways then one



Check List of items to work on to ensure requirements as of 09/14/2024 are met and completed:

Things to note:

did get ahead of a few items in the check list but all is good, saw some items flare up in STS and fixed them as they appeared

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

6) Change the Car class's fields to have private visibility.

when made private CarTester.java threw errors on the following lines of code
   
fredsCar.make = "Kia";

fredsCar.model = "Sportage";

fredsCar.color = "Hot Pink";

fredsCar.purchasePrice = 28565;


bernicesCar.make = "Toyota";

bernicesCar.model = "Prius";

bernicesCar.color = "Neon";

bernicesCar.purchasePrice = 32199;
  
Add getters and setters for the fields.

need to use the getters and setters created to fix errors from making private parts

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

got a bit ahead and did this earlier complete 09/14/2024 

fixed errors as noted above in step 6

checked code into github 09/14/2024

8) The CarTester class is hurling errors.
CarTester can't find your Car class.

Fixed the issue. had to add import (import com.skilldistillery.dealership.entities.*;)

CarTester can't touch the Car's private parts directly. We'll illustrate 2 different ways to fix this. In Car.java:

Add a constructor to initialize a car's fields.

Now fix the errors for fredCar in CarTester by using the new constructor.

Add getters and setters.

Now fix the errors for bernicesCar.

InCarTester, instantiate bernicesCar without using your new 4-parameter ctor.

Fix any errors you may encounter on this step.

After instantiating bernicesCar, assign the make, model, color and price by using your new getter and setter methods.

Run the CarTester application and verify everything is working.

complete 09/14/2024 and runs with no issues

checked into git hub

9)  Create a class in package com.skilldistillery.dealership.entities called CarLot. This is where Dealing Doogie will park up to a maximum of 10 Cars. In CarLot:

Create a private field to hold the cars. 

What data structure will you use to hold all 10 Cars? an array

Create a private field that tracks how many cars are currently parked in the lot.

Create a no-arg constructor.

got code added, but when go to run it, gives output to CarTester rather than CarLotTester no idea why, posted question to ask for help in
homework chat, checking code into github will check back tomorrow to see if i get an answer

fixed issue with main completed 09/15/2024 checked into github

Dealing Doogie purchased Joe Bob's car, and needs to add it to inventory.

Create 2 methods:
addCar(Car car): This allows a Car to be added to the lot. Think about the big picture: what if the lot is full? As cars come and go (car sold), how will you make certain the attendant doesn't try to park a car in a space that already has a car? Are you keeping track of the current number of cars in the lot as they are parked (and sold)?

getListOfCarsInInventory(): Produces a list of all the cars currently in inventory (ie: all the parked Cars). What will this method return?

finally finished 9/20/2024 checked into github
     
     
10) Create a class in package com.skilldistillery.dealership.app called CarLotTester. This class will have a main method. In CarLotTester:

Create a CarLot instance.
Park 1 or 2 Cars in the CarLot.
Call getListOfCarsInInventory and display all the cars currently in inventory.
Be careful to not display null for an empty spot in the car lot (that would freak Dealing Doogie out).
Create a couple more cars, and park them in the CarLot.
Call getListOfCarsInInventory to get and display the latest inventory of parked cars.
finished 9/20/2024 checked into github
