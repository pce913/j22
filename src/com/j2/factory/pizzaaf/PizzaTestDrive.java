package com.j2.factory.pizzaaf;

public class PizzaTestDrive{
  public static void main(String[] args){
    
    PizzaStore nyStore=new NYPizzaStore();
    PizzaStore chicagoStore=new ChicagoPizzaStore();
    
     
    Pizza pizza=nyStore.orderPizza("cheese");
    pizza.toString();
    
    pizza=chicagoStore.orderPizza("potato");
    pizza.toString();
    
   
  }
}