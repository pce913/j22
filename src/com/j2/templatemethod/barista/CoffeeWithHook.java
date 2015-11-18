package com.j2.templatemethod.barista;

public class CoffeeWithHook extends CaffeinBeverage{

  public void brew(){
    System.out.println("Dripping");
  }
  public void addCondiments(){
    System.out.println("Adding sugar+milk");
  }
  
  public boolean customerWantsComdiments(){
    String answer="yes";
    if(answer.toLowerCase().startsWith("y")){
      return true;
    }
    else
      return false;
  }
}