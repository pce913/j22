package com.j2.factory.pizzaaf;

public class PotatoPizza extends Pizza{
  public PotatoPizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory=ingredientFactory;
  }
  
  void prepare(){
    System.out.println("preparing "+ name);
    dough=ingredientFactory.createDough();
    potato=ingredientFactory.createPotato();
    cheese=ingredientFactory.createCheese();
  }
}