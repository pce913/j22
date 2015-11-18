package com.j2.templatemethod.barista;

public abstract class CaffeinBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  public void boilWater(){
    System.out.println("Boiling");
  }
  public abstract void brew();
  public void pourInCup(){
    System.out.println("Pouring");
  }
  public abstract void addCondiments();
}