package com.j2.iterator.dinermerger.before;
import java.util.*;

public class PancakeHouseMenu{
  int numberOfItems=0;
  ArrayList <MenuItem> menuItems;
  public PancakeHouseMenu(){
    //menuItems=new MenuItem[MAX_ITEMS];
     menuItems=new ArrayList <MenuItem>();
     addItem("vegetarian BLT","delicious",true,3.22);
    addItem("pancake","good",false,3.01);
    addItem("juice","nice",true,3.11);
  }
  public void addItem(String n,String d,boolean v,double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
   menuItems.add(menuItem);
  }
 // public MenuItem[] getMenuItems()
  
   public ArrayList getMenuItems(){
    return menuItems;
  }
}