package com.j2.command.simpleremote;

public class RemoteControlTest{
  public static void main(String[] args){
    SimpleRemoteControl remote=new SimpleRemoteControl();      //invoker
    Light light=new Light();        //receiver
    LightOnCommand lightOn=new LightOnCommand(light);    //command
    remote.setCommand(lightOn);
    remote.buttonWasPressed();
  }
}