package com.j2.facade.smartHome;

public class SmartPan {
	String description;
	TouchPad touchPad;
	public SmartPan(String description){
		this.description=description;
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
	public String toString(){
		return description;
	}
}
