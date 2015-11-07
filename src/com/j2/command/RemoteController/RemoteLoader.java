package com.j2.command.RemoteController;

public class RemoteLoader{
  public static void main(String args[]){
    RemoteControlWithUndo remote=new RemoteControlWithUndo();
    Light light=new Light("Living Room");
    LightOnCommand livingRoomLightOn=new LightOnCommand(light);
    LightOffCommand livingRoomLightOff=new LightOffCommand(light);
    
    DVD dvd=new DVD("Beatles - Let it be");
    DVDOnCommand beatlesDVDOn=new DVDOnCommand(dvd);
    DVDOffCommand beatlesDVDOff=new DVDOffCommand(dvd);
    
    
    remote.setCommand(0,livingRoomLightOn,livingRoomLightOff);
    remote.onButtonWasPressed(0);
    remote.undoButtonWasPressed(0);

    
    remote.setCommand(1,beatlesDVDOn,beatlesDVDOff);
    remote.onButtonWasPressed(1);
    remote.undoButtonWasPressed(1);
    remote.offButtonWasPressed(1);
    
  }
}