package com.j2.factory;

public abstract class Pizza{
  String name;
  void prepare(){
    System.out.println("preparing...");
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