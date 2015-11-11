package com.j2.command.RemoteController;

public interface Command{
  public void execute();
  public void undo();
}