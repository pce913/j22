package com.j2.facade.smartHome;

public class SmartHomeFacade {
	private Light light;
	private Computer computer;
	private SmartPan smartPan;
	private TouchPad touchPad;
	
	public SmartHomeFacade(Light light,Computer computer,
			SmartPan smartPan,TouchPad touchPad){
		this.light=light;
		this.computer=computer;
		this.smartPan=smartPan;
		this.touchPad=touchPad;
	}
	public void beginStudy(String subject){
		System.out.println("Get ready to study...");
		light.on();
		computer.on();
		computer.powerMode();
		touchPad.on();
		touchPad.setMode(subject);
		smartPan.on();
	}
	public void endStudy(){
		System.out.println("End study...");
		light.off();
		computer.off();
		touchPad.off();
		smartPan.off();
	}
}
