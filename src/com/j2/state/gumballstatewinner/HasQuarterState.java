package com.j2.state.gumballstatewinner;

public class HasQuarterState implements State{
  randomWinner=new Random(System.currentTimeMill);
  GumballMachine gm;
  public HasQuarterState(GumballMachine gm){
    this.gm=gm;
  }
  public void insertQuarter(){
      System.out.println("You can not insert anotehr quarer");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
   gm.setState(gm.getNoQuarterState());
  }
  public void turnCrank(){
     System.out.println("You turned...");
     int winner=randomWinner.nextInt(10);
     gm.setState(gm.getSoldState());
  
 
  }
  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}