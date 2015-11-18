package com.j2.facade.smartHome;

public class Computer {
	String description;
	TouchPad touchPad;
	public Computer(String description,TouchPad touchPad){
		this.description=description;
		this.touchPad=touchPad;
	}
	public void on(){
		System.out.println(description+" on");
	}
	public void off(){
		System.out.println(description+" off");
	}
	public void setTouchPad(TouchPad touchPad){
		System.out.println(description+" setting touch-pad to "+touchPad);
		this.touchPad=touchPad;
	}
	public void powerMode(){
		System.out.println("Computer is set on power mode");
	}
	public void sleepMode(){
		System.out.println("Computer is set on sleep mode");
	}
	public String toString(){
		return description;
	}
}
