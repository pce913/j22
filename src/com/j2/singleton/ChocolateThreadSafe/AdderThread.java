package com.j2.singleton.ChocolateThreadSafe;

public class AdderThread extends Thread{
	private static ChocolateBoiler uniqueInstance;
	public AdderThread(ChocolateBoiler u){
		uniqueInstance=u;
	}
	public void run(){
		uniqueInstance.make();
	}
}
