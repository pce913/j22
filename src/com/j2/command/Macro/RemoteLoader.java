package com.j2.command.Macro;

public class RemoteLoader{
  public static void main(String args[]){
    RemoteControlWithMacro remote=new RemoteControlWithMacro();
    Light light1=new Light("Living Room");
    LightOnCommand livingRoomLightOn=new LightOnCommand(light1);
    LightOffCommand livingRoomLightOff=new LightOffCommand(light1);
    
    DVD dvd=new DVD("Beatles - Let it be");
    DVDOnCommand beatlesDVDOn=new DVDOnCommand(dvd);
    DVDOffCommand beatlesDVDOff=new DVDOffCommand(dvd);
    
    Light light2=new Light("Kitchen");
    LightOnCommand kitchenRoomLightOn=new LightOnCommand(light2);
    LightOffCommand kitchenRoomLightOff=new LightOffCommand(light2);
    
    CeilingFan ceilingFan=new CeilingFan(3);
    CeilingFanOnCommand ceilingFanThreeOn=new CeilingFanOnCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanThreeOff=new CeilingFanOffCommand(ceilingFan);
    
    
    
    Command[] partyOn={livingRoomLightOn,beatlesDVDOn,kitchenRoomLightOn,ceilingFanThreeOn};
    Command[] partyOff={livingRoomLightOff,beatlesDVDOff,kitchenRoomLightOff,ceilingFanThreeOff};
    MacroCommand partyOnMacro=new MacroCommand(partyOn);
    MacroCommand partyOffMacro=new MacroCommand(partyOff);
    
    remote.setCommand(0,livingRoomLightOn,livingRoomLightOff);
    remote.onButtonWasPressed(0);
    remote.undoButtonWasPressed(0);
    
    
    remote.setCommand(1,beatlesDVDOn,beatlesDVDOff);
    remote.onButtonWasPressed(1);
    remote.undoButtonWasPressed(1);
    
    remote.setCommand(2,kitchenRoomLightOn,kitchenRoomLightOff);
    remote.onButtonWasPressed(2);
    remote.offButtonWasPressed(2);
    remote.undoButtonWasPressed(2);
    
    remote.setCommand(3,ceilingFanThreeOn,ceilingFanThreeOff);
    remote.onButtonWasPressed(3);
    remote.offButtonWasPressed(3);
    remote.undoButtonWasPressed(3);
    
    remote.setCommand(4, partyOnMacro, partyOffMacro);
    remote.onButtonWasPressed(4);
    remote.offButtonWasPressed(4);
    remote.undoButtonWasPressed(4);
  }
}