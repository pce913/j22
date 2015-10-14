package com.j2.factory;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza=null;
    if(type.equals("cheese")==true){
      pizza=new CheesePizza();
    }
    return pizza;
  }
}