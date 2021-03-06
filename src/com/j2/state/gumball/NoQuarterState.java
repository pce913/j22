package com.j2.state.gumballstate;

public class NoQuarterState implements State{
  GumballMachine gm;
  public NoQuarterState(GumballMachine gm){
    this.gm=gm;
  }
  public void insertQuarter(){
    System.out.println("You inserted a quarter");
     gm.setState(gm.getHasQuarterState());
  }
  
  public void ejectQuarter(){
    System.out.println("You inserted a quarter");
     gm.setState(gm.getHasQuarterState());
  }
  
  public void turnCrank(){
    System.out.println("You turned but there's no quarter");
  }
  public void dispense(){
    System.out.println("Pay first");
  }
}