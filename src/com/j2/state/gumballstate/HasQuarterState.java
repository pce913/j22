package com.j2.state.gumballstate;

public class HasQuarterState implements State{
  GumballMachine gm;

  public HasQuarterState(GumballMachine gm){
    this.gm=gm;
  }
  public void insertQuarter(){
      System.out.println("You can not insert another quarter");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
   gm.setState(gm.getNoQuarterState());
  }
  public void turnCrank(){
     System.out.println("You turned...");
     //state = SOLD;
     gm.setState(gm.getSoldState());
    // dispense();
 
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
  public String toString() {
      return "waiting for turn of crank";
  }
}