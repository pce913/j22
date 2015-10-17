package com.j2.factory.shape;

public class Shadow extends Effect{
  public shape createShape(String type){
    if(type.equals("triangle")==true)
      shapes=new ShadowTriangle();
    else if(type.equals("rectangle")==true)
      shapes=new ShadowRectangle();
    
    return shapes;
  }
  
}