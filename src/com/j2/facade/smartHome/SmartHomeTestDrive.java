package com.j2.facade.smartHome;

public class SmartHomeTestDrive {
	public static void main(String args[]){
		Light light=new Light("My room Light");
		TouchPad touchPad=new TouchPad("My TouchPad");
		SmartPan smartPan=new SmartPan("My smartPan");
		Computer computer=new Computer("My Computer",touchPad);
		SmartHomeFacade smartHome=new SmartHomeFacade(light,
				computer,smartPan,touchPad);
		smartHome.beginStudy("Math");
		smartHome.endStudy();
	}
}
