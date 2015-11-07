package com.j2.command.Macro;

public class MacroCommand implements Command{
	Command[] commands;
	public MacroCommand(Command[] commands){
		this.commands=commands;
	}
	public void execute(){
		System.out.println("\n");
		for(int i=0;i<commands.length;i++)
			commands[i].execute();
	}
	public void undo(){
		for(int i=0;i<commands.length;i++)
			commands[i].undo();
	}
}
