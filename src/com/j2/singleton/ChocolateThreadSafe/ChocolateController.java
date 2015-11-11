package com.j2.singleton.ChocolateThreadSafe;

public class ChocolateController {
	public static void main(String args[]){
		ChocolateBoiler boiler1=ChocolateBoiler.getInstance();
		ChocolateBoiler boiler2=ChocolateBoiler.getInstance();
		ChocolateBoiler boiler3=ChocolateBoiler.getInstance();
		//System.out.println(boiler1.isEmpty());
		AdderThread b1=new AdderThread(boiler1);
		AdderThread b2=new AdderThread(boiler2);
		AdderThread b3=new AdderThread(boiler3);
		b1.start ();
		b2.start();
		b3.start();
		try{
			b1.join();
			b2.join();
			b3.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
