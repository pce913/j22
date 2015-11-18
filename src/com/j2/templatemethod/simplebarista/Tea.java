package com.j2.templatemethod.simplebarista;

public class Tea{
  public void prepareRecipe(){
    boilWater();
    steepTeaBag();
    pourInCup();
    addLemon();
  }
  public void boilWater(){
    System.out.println("Boiling");
  }
  public void steepTeaBag(){
    System.out.println("Steeping");
  }
  public void pourInCup(){
    System.out.println("Pouring");
  }
  public void addLemon(){
    System.out.println("Adding lemon");
  }
}