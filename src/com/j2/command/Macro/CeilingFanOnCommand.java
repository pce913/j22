package com.j2.command.Macro;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;
	  int level;
	  public CeilingFanOnCommand (CeilingFan ceilingFan){
	    this.ceilingFan=ceilingFan;
	   
	  }
	  public void execute(){
		  level=ceilingFan.getLevel();
		  ceilingFan.turnOn();
	  }
	  public void undo(){
		  ceilingFan.prev();
	  }
}
