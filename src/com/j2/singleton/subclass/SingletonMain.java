package com.j2.singleton.subclass;

public class SingletonMain{
  public static void main(String args[]){
    Singleton s1=CoolerSingleton.getInstance();
    Singleton s2=HotterSingleton.getInstance();
  }
}