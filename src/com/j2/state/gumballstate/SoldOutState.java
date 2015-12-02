package com.j2.state.gumballstate;

public class SoldOutState implements State{
  GumballMachine gm;
  public SoldOutState(GumballMachine gm){
    this.gm=gm;
  }
  public void insertQuarter(){
   System.out.println("You can not insert a quarter");
  }
  
  public void ejectQuarter(){
   System.out.println("You can't eject, you haven't inserted a quarter yet");
  }
  
  public void turnCrank(){
   System.out.println("You turned, but there are no gumballs");
  }
  public void dispense(){
     System.out.println("No gumball dispensed");
  }
}