package com.j2.decorator;

public class Mocha extends ComdimentDecorator{
  
  public Mocha(Beverage beverage){
    this.beverage=beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + ", Mocha";
  }
  public double cost(){
   return .20+beverage.cost();
  }
}