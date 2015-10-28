package com.j2.factory.pizzafm;

public abstract class Pizza{
  String name;
  void prepare(){
    System.out.println("Preparing "+name);
  }
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
  
  public String toString(){
    System.out.println("----"+name+"----");
    return name;
  }
}