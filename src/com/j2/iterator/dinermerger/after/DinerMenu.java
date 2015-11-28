package com.j2.iterator.dinermerger.after;
//import com.j2.iterator.dinermerger.before.MenuItem;

public class DinerMenu implements Menu {
  MenuItem[] menuItems;
  
   static final int MAX_ITEMS=6;
  int numberOfItems=0;
  public DinerMenu(){
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("vegetarian BLT","delicious",true,3.22);
    addItem("pancake","good",false,3.01);
    addItem("juice","nice",true,3.11);
    
    addItem("»óÃß½Ó","Çàº¹ÇÑ¸À",true,3.10);
    addItem("¹èÃß½Ó","Áñ°Å¿î¸À",true,3.11);
    addItem("¹«½Ó","¸ÀÀÖ´Â¸À",true,3.12);
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
  
  
  
  public Iterator createIterator(){
    return new DinerMenuIterator(menuItems);
  }
}