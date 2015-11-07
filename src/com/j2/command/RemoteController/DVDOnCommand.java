package com.j2.command.RemoteController;

public class DVDOnCommand implements Command {
	 DVD dvd;
	 
	  public DVDOnCommand(DVD dvd){
	    this.dvd=dvd;
	   
	  }
	  public void execute(){
	    dvd.on();
	  }
	  public void undo(){
	    dvd.stop();
	  }
}
