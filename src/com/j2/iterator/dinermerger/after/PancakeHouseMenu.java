package com.j2.iterator.dinermerger.after;
import java.util.*;
//import com.j2.iterator.dinermerger.before.MenuItem;
public class PancakeHouseMenu implements Menu{
  int numberOfItems=0;
  ArrayList <MenuItem> menuItems;
  public PancakeHouseMenu(){
    //menuItems=new MenuItem[MAX_ITEMS];
     menuItems=new ArrayList <MenuItem>();
     addItem("choco pancake","delicious",true,3.22);
    addItem("strawberry pankace","good",false,3.01);
    addItem("plane pankace","nice",true,3.00);
  }
  public void addItem(String n,String d,boolean v,double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
   menuItems.add(menuItem);
  }
 // public MenuItem[] getMenuItems()
  
   public ArrayList getMenuItems(){
    return menuItems;
  }
   
   public Iterator createIterator(){
     return new PancakeHouseMenuIterator(menuItems);
   }
}