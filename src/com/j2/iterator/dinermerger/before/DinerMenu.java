package com.j2.iterator.dinermerger.before;

public class DinerMenu{
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("vegetarian BLT","delicious",true,3.22);
    addItem("pancake","good",false,3.01);
    addItem("juice","nice",true,3.11);
  }
  public void addItem(String n,String d,boolean v,double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
    if(numberOfItems>=MAX_ITEMS){
      System.out.println("Sorry full...");
    }
    else{
    menuItems[numberOfItems]=menuItem;
    numberOfItems+=1;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
  
}