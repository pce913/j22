package com.j2.factory.pizzaaf;

public abstract class  PizzaStore{
  Pizza pizza;
  PizzaIngredientFactory ingredientFactory;
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