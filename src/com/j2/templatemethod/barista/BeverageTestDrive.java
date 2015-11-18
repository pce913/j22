package com.j2.templatemethod.barista;

public class BeverageTestDrive{
  public static void main(String args[]){
    Coffee coffee=new Coffee();
    coffee.prepareRecipe();
    CoffeeWithHook coffeeHook=new CoffeeWithHook();
    coffeeHook.prepareRecipe();
  }
}