package com.j2.command.simpleremote;

public class SimpleRemoteControl{
  command slot;
  
  public SimpleRemoteControl(){}
  public void setCommand(command command){
    slot=command;
  }
  
  public void buttonWasPressed(){
    slot.execute();
  }
}