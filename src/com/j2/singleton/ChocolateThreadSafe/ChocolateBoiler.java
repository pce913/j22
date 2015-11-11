package com.j2.singleton.ChocolateThreadSafe;


public class ChocolateBoiler extends Thread{
	private boolean empty;
	  private boolean boiled;
	  private static int numCalled;
	  private int numbering=1;
	  
	  private boolean waiting=false;
	  
	  private static ChocolateBoiler uniqueInstance;
	  private ChocolateBoiler(){}
	  public static ChocolateBoiler getInstance(){
	    if(uniqueInstance==null){
	      System.out.println("Creating a new instance...");
	      uniqueInstance=new ChocolateBoiler();
	    }
	    System.out.println("numCalled: " + numCalled++);
	    return uniqueInstance;
	  }
	  public void fill(){
	    if(isEmpty()){
	      empty=false;
	      boiled=false;
	    }
	    System.out.println("filling");
	  }
	  
	  public void drain(){
		  if(!isEmpty() && isBoiled()){
			  empty=true;
		  }
		  System.out.println("draining and finished #"+(numbering++));
	  }
	  
	  public void boil(){
		  if(!isEmpty() && isBoiled()){
			  boiled=true;
		  }
		  System.out.println("boiling");
		  
	  }
	  
	  public boolean isEmpty(){
	    return empty;
	  }
	  public boolean isBoiled(){
		    return boiled;
		  }
	  
	  public void make(){
		  synchronized(this){
			  if(waiting==true)
				  System.out.println("waiting!!!");
			  waiting=true;
			  this.fill();
			  this.boil();
			  this.drain();
		  }
	  }
	  
	  public void run(){
		 this.make();
	  }
}
