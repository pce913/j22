package com.j2.state.gumballstate;

public class GumballMachine{
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State state=soldOutState;
  int count=0;
  public GumballMachine(int n){
    this.count=n;
    soldOutState=new SoldOutState(this);
    hasQuarterState=new HasQuarterState(this);
    noQuarterState=new NoQuarterState(this);
    soldState=new SoldState(this);
  
  if(n>0){
    state=noQuarterState;
    }
  }
  public void setState(State state){
    this.state=state;
  }
  public State getState(){
    return state;
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  
  public void turnCrank(){
    state.turnCrank();
  }
  
  public State getNoQuarterState(){
    return noQuarterState;
  }
  
  public State getSoldState(){
    return soldState;
  }
  
   public State getHasQuarterState(){
    return hasQuarterState;
  }
   
   public State getSoldOutState(){
     return soldOutState;
   }
   
   public int getCount(){
     return count;
   }
   
   public void setCount(int count){
     this.count=count;
   }
}