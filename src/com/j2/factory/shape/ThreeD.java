package com.j2.factory.shape;

public class ThreeD extends Effect{
  public shape createShape(String type){
    if(type.equals("triangle")==true)
      shapes=new ThreeDTriangle();
    else if(type.equals("rectangle")==true)
      shapes=new ThreeDRectangle();
    
    return shapes;
  }
  
}