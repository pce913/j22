package com.j2.templatemethod.barista;

public class Coffee extends CaffeinBeverage{

  public void brew(){
    System.out.println("Dripping");
  }
  public void addCondiments(){
    System.out.println("Adding sugar+milk");
  }
}