package com.j2.decorator;

public class Soy extends ComdimentDecorator{
  
  
  public Soy(Beverage beverage){
    this.beverage=beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + " Soy";
  }
  
   public double cost(){
     return .10+beverage.cost();
  }
}