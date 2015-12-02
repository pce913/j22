package com.j2.state.gumballstate;

public class SoldState implements State{
  GumballMachine gm;
  public SoldState(GumballMachine gm){
    this.gm=gm;
  }
  public void insertQuarter(){
   System.out.println("wait");
  }
  
  public void ejectQuarter(){
    System.out.println("Sorry, you already turned the crank");
  }
 
  public void turnCrank(){
    System.out.println("Turning twice doesn't get you another gumball!");
  }
  public void dispense(){
    System.out.println("A gumball comes rolling out the slot");
    int count=gm.getCount();
    count=count-1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                //state = SOLD_OUT;
                gm.setState(gm.getSoldOutState());
            } else {
                //state = NO_QUARTER;
              gm.setState(gm.getNoQuarterState());
            }
    gm.setCount(count);
  }
}