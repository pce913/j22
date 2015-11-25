package com.j2.templatemethod.macchiato;

public abstract class CaffeinBeverageWithHook{
	String beverage;
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()==true)
    	addCondiments();
    hereIsBeverage();
    
  }
  public void boilWater(){
    System.out.println("Boiling");
  }
  public abstract void brew();
  public abstract void addCondiments();
  public void pourInCup(){
    System.out.println("Pouring");
  }
  public void hereIsBeverage(){
	  System.out.println("Here is your "+beverage);
  }
  public boolean customerWantsCondiments(){
    return true;
  }
  
}