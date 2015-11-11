package com.j2.singleton.PrintSpooler;


public class AdderThread extends Thread{
	private static PrintSpooler uniqueInstance;
	public AdderThread(PrintSpooler u){
		uniqueInstance=u;
	}
	public void run(){
		uniqueInstance.make();
	}
}
