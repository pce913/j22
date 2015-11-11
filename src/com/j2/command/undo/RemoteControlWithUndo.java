package com.j2.command.undo;

class RemoteControlWithUndo{
  Command[] onCommand;
  Command[] offCommand;
  public RemoteControlWithUndo(){
    onCommand=new Command[7];
    offCommand=new Command[7];
    Command noCommand=new NoCommand();
    for(int i=0;i<7;i++){
      onCommand[i]=noCommand;
      offCommand[i]=noCommand;
    }
  }
  public void setCommand(int slot,Command on,Command off){
    onCommand[slot]=on;
    offCommand[slot]=off;
  }
  public void onButtonWasPressed(int slot){
    onCommand[slot].execute();
  }
  public void offButtonWasPressed(int slot){
    offCommand[slot].execute();
  }
}