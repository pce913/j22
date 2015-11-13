package com.j2.facade.smartHome;

public class TouchPad {
	String description;
	SmartPan smartPan;
	String mode;
	public TouchPad(String description){
		this.description=description;
	}
	public void on(){
		System.out.println(description+" on");
	}
	public void off(){
		System.out.println(description+" off");
	}
	public void setSmartPan(TouchPad touchPad){
		System.out.println(description+" setting smartPan to "+touchPad);
		this.smartPan=smartPan;
	}
	public void setMode(String mode){
		this.mode=mode;
		System.out.println("TouchPad set on "+mode+" mode");
	}
	public String toString(){
		return description;
	}
}
