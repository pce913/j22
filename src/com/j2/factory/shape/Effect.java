package com.j2.factory.shape;

public abstract class Effect{
  shape shapes;
  
  public shape whatShape(String type){
    shapes=createShape(type);
    return shapes;
  }
  
  public abstract shape createShape(String type);
} 