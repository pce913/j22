package com.j2.singleton.stat;
public class Singleton{
 
  private static int numCalled;
  
  private static Singleton uniqueInstance=new Singleton();
  private Singleton(){}
  public static Singleton getInstance(){
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }

  
}