package com.j2.singleton.PrintSpooler;



public class PrintSpooler {
	private boolean empty;
	  //private boolean boiled;
	  private static int numCalled;
	  private boolean waiting=false;
	  private int numbering=1;
	  private static PrintSpooler uniqueInstance;
	  private PrintSpooler(){}
	  public static PrintSpooler getInstance(){
	    if(uniqueInstance==null){
	      System.out.println("Creating a new instance...");
	      uniqueInstance=new PrintSpooler();
	    }
	    System.out.println("numCalled: " + numCalled++);
	    return uniqueInstance;
	  }
	  public void print(){
	    if(isEmpty()){
	      empty=false;
	     // boiled=false;
	    }
	    System.out.println("printing and finished #"+(numbering++));
	  }
	 
	  
	  public boolean isEmpty(){
	    return empty;
	  }
	
	  
	  public void make(){
		  synchronized(this){
			  if(waiting==true)
				  System.out.println("waiting!!!");
			  waiting=true;
			  this.print();
		  }
	  }
	  
	  public void run(){
		 this.make();
	  }
}
