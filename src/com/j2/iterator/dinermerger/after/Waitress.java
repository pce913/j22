package com.j2.iterator.dinermerger.after;
import com.j2.iterator.dinermerger.before.MenuItem;
public class Waitress{
  PancakeHouseMenu pm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p,DinerMenu d){
    this.pm=p;
    this.dm=d;
  }
  public void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem menuItem=(MenuItem)iterator.next();
      System.out.println(menuItem.getName());
      System.out.println(menuItem.getDescription());
      System.out.println(menuItem.getPrice());
    }
  }
}