package com.j2.facade.smartHome;

public class Light {
	String description;
	public Light(String description){
		this.description=description;
	}
	public void on(){
		System.out.println(description+" on");
	}
	public void off(){
		System.out.println(description+" off");
	}
	public String toString(){
		return description;
	}
}
