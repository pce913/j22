package com.j2.factory.pizzaaf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

  
  public Dough createDough(){
    return new ThickDough();
  }
  
  public Cheese createCheese(){
    return new ChedaCheese();
  }
  
  public Potato createPotato(){
    return new MashedPotato();
  }
}