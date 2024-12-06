package com.enfy.abstractinheritance;
//Abstract Fruit class
abstract class Fruit {
 // Abstract method to get the type of fruit
 abstract String getType();
}

//Concrete subclass for Apple
class Apple extends Fruit {
 @Override
 String getType() {
     return "Apple";
 }
}

//Concrete subclass for Watermelon
class Watermelon extends Fruit {
 @Override
 String getType() {
     return "Watermelon";
 }
}

//Concrete subclass for Mango
class Mango extends Fruit {
 @Override
 String getType() {
     return "Mango";
 }
}




