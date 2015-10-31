package com.j2.singleton.PrintSpooler;



public class PrintSpoolerController {
	public static void main(String args[]){
		PrintSpooler print1=PrintSpooler.getInstance();
		PrintSpooler print2=PrintSpooler.getInstance();
		PrintSpooler print3=PrintSpooler.getInstance();
		//System.out.println(boiler1.isEmpty());
		AdderThread p1=new AdderThread(print1);
		AdderThread p2=new AdderThread(print2 );
		AdderThread p3=new AdderThread(print3);
		p1.start ();
		p2.start();
		p3.start();
		try{
			p1.join();
			p2.join();
			p3.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
}
