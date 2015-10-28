package com.j2.factory.pizzaaf;

public class NYPizzaStore extends PizzaStore{
  public NYPizzaStore(){
    ingredientFactory=new NYPizzaIngredientFactory();
  }
  public Pizza createPizza(String type){
    if(type.equals("cheese")==true){
      pizza=new CheesePizza(ingredientFactory);
      pizza.setName("NYStyleCheesePizza");
    }
    else if(type.equals("potato")==true){
      pizza=new PotatoPizza(ingredientFactory);
      pizza.setName("NYStylePotatoPizza");
    }
    
    return pizza;
  }
  
}