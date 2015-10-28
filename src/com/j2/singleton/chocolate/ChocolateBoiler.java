package com.j2.singleton.chocolate;
public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static int numCalled;
  
  private static ChocolateBoiler uniqueInstance;
  private ChocolateBoiler(){}
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance==null){
      System.out.println("Creating a new instance...");
      uniqueInstance=new ChocolateBoiler();
    }
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
      empty=false;
      boiled=false;
    }
  }
  
  public boolean isEmpty(){
    return empty;
  }
}