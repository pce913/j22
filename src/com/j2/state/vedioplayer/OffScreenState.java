package com.j2.state.vedioplayer;

public class OffScreenState implements State {
	 VedioPlayer vp;

	  public OffScreenState (VedioPlayer vp){
	    this.vp=vp;
	  }
	  public void playVedio(){
	      System.out.println("Vedio is off");
	  }
	  public void stopVedio(){
		  System.out.println("Vedio is off");
	  }
	  public void endVedio(){
		  System.out.println("Vedio is off");
	  }
	  public void replayVedio(){
		  System.out.println("Vedio is off");
	  }
	  public String toString() {
	      return "Vedio is off";
	  }
}
