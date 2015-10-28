package com.j2.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore{
  public ChicagoPizzaStore(){
    ingredientFactory=new ChicagoPizzaIngredientFactory();
  }
  
  public Pizza createPizza(String type){
    if(type.equals("cheese")==true){
      pizza=new CheesePizza(ingredientFactory);
      pizza.setName("ChicagoStyleCheesePizza");
    }
    else if(type.equals("potato")==true){
      pizza=new PotatoPizza(ingredientFactory);
      pizza.setName("ChicagoStylePotatoPizza");
    }
    
    return pizza;
  }
  
}