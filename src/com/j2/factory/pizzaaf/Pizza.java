package com.j2.factory.pizzaaf;

public abstract class Pizza{
  String name=null;
  Cheese cheese=null;
  Dough dough=null;
  Potato potato=null;
  PizzaIngredientFactory ingredientFactory;
  abstract void prepare();
  
  void bake(){
     System.out.println("baking...");
  }
  void cut(){
    System.out.println("cut...");
  }
  void box(){
    System.out.println("boxing...");
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(String name){
    this.name=name;
  }
  
  public String toString(){
    System.out.println("----"+name+"----"+dough.kind()+"----"+cheese.kind()+"----"+potato.kind());
    return name;
  }
}