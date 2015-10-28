package com.j2.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    if(type.equals("cheese")==true)
      pizza=new NYStyleCheesePizza();
    else if(type.equals("potato")==true)
      pizza=new NYStylePotatoPizza();
    
    return pizza;
  }
  
}