package com.j2.templatemethod.barista;

public abstract class CaffeinBeverageWithHook{
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
  public abstract void addCondiments();
  public void pourInCup(){
    System.out.println("Pouring");
  }
  boolean customerWantsCondiments(){
    return true;
  }
  
}