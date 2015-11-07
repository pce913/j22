package com.j2.command.Macro;

public class CeilingFanOffCommand implements Command{
	CeilingFan ceilingFan;
	  int level;
	  public CeilingFanOffCommand (CeilingFan ceilingFan){
	    this.ceilingFan=ceilingFan;
	   
	  }
	  public void execute(){
		  level=ceilingFan.getLevel();
		  ceilingFan.turnOff();
	  }
	  public void undo(){
		  ceilingFan.prev();
	  }
}
