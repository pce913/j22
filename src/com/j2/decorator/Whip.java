package com.j2.decorator;

public class Whip extends ComdimentDecorator{
  
  public Whip(Beverage beverage){
    this.beverage=beverage;
  }
  public String getDescription(){
    return beverage.getDescription() + ", Whip";
  }
  public double cost(){
   return .10+beverage.cost();
  }
}