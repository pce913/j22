package com.j2.factory.shape;

public class shapeTestDrive{
  public static void main(String[] args){
    Effect threeD=new ThreeD();
    Effect shadow=new Shadow();
 
     
    shape shapes=threeD.whatShape("triangle");
    shapes.toString();
    
    shapes=shadow.whatShape("rectangle");
    shapes.toString();
    
 
  }
}