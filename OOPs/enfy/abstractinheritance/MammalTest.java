package com.enfy.abstractinheritance;
//Abstract Mammal class
abstract class Mammal {
 // Abstract method for displaying the type of mammal
 abstract String getType();
}

//Concrete Bear class extending Mammal
class Bear extends Mammal {
 @Override
 String getType() {
     return "Bear";
 }
}


//Vehicle interface with the drive() method
interface Vehicle {
 void drive();
}

//Concrete Elephant class extending Mammal and implementing Vehicle
class Elephant extends Mammal implements Vehicle {
 @Override
 String getType() {
     return "Elephant";
 }

 // Implement the drive method from Vehicle interface
 @Override
 public void drive() {
     System.out.println("Elephant is being used as a vehicle.");
 }
}

//Concrete Horse class extending Mammal and implementing Vehicle
class Horse extends Mammal implements Vehicle {
 @Override
 String getType() {
     return "Horse";
 }

 // Implement the drive method from Vehicle interface
 @Override
 public void drive() {
     System.out.println("Horse is being ridden.");
 }
}

//Concrete Lion class extending Mammal
class Lion extends Mammal {
 @Override
 String getType() {
     return "Lion";
 }
}

//Main class
public class MammalTest {
 public static void main(String[] args) {
     // Create an array of Mammal objects
     Mammal[] mammals = new Mammal[4];

     // Add different mammals to the array
     mammals[0] = new Bear();
     mammals[1] = new Elephant();
     mammals[2] = new Horse();
     mammals[3] = new Lion();

     // Loop through the array and call drive() for objects that implement Vehicle
     for (Mammal mammal : mammals) {
         System.out.println("Mammal: " + mammal.getType());
         
         // Check if the mammal implements the Vehicle interface
         if (mammal instanceof Vehicle) {
             ((Vehicle) mammal).drive();
         }
     }
 }
}
