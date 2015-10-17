package com.j2.factory.pizzafm;

public abstract class  PizzaStore{
 
  Pizza pizza;
  public PizzaStore(){
    pizza=null;
  }
  public Pizza orderPizza(String type){
 
   pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
   return pizza;
  }
  
  public abstract Pizza createPizza(String type);
}