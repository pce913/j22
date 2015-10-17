package com.j2.factory.pizzafm;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore nyStore=new NYPizzaStore();
    PizzaStore chicagoStore=new ChicagoPizzaStore();
    PizzaStore SMStore=new SMPizzaStore();
     
    Pizza pizza=nyStore.orderPizza("cheese");
    pizza.toString();
    
    pizza=chicagoStore.orderPizza("cheese");
    pizza.toString();
    
    pizza=SMStore.orderPizza("potato");
    pizza.toString();
  }
}