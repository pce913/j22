package com.j2.command.Macro;

public class DVD {
	String dvd;
	boolean play=false;
	public DVD(String dvd){
		this.dvd=dvd;
	}
	
	public void on(){
		play=true;
	    System.out.println(dvd+" DVD is on");
	  }
	  public void off(){
		 play=false;
	    System.out.println(dvd+" DVD is off");
	  }
	 public void stop(){
		 if(play==true){
			 play=false;
		 System.out.println("DVD is not played");
		 }
		 else{
			 play=true;
			 System.out.println("DVD is playing");
		 }
	 }
}
