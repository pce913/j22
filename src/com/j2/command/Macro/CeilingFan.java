package com.j2.command.Macro;

public class CeilingFan{
	int level;
	int prevLevel;
	public CeilingFan(int level){
		this.level=level;
		prevLevel=level;
	}
	public void turnOn(){
		level=prevLevel;
	    System.out.println("Fan is "+level+" level on");
	  }
	  public void turnOff(){
		  this.level=0;
	    System.out.println("Fan is off");
	  }
	public void prev(){
		if(level==0)
			this.turnOn();
		else
			this.turnOff();
	}
	 
	public int getLevel(){
		return level;
	}
	  
}
