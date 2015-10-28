package com.j2.singleton.subclass;
public class Singleton{
 
  private static int numCalled=0;
  
  protected static Singleton uniqueInstance=new Singleton();
  protected Singleton(){}
  public static Singleton getInstance(){
    if(uniqueInstance==null){
      synchronized(Singleton.class){
        if(uniqueInstance==null)
          uniqueInstance=new Singleton();
      }
    }
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }

  
}