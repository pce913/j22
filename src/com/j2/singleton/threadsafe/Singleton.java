package com.j2.singleton.threadsafe;
public class Singleton{
 
  private static int numCalled;
  
  private static Singleton uniqueInstance=new Singleton();
  private Singleton(){}
  public static synchronized Singleton getInstance(){
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }

  
}