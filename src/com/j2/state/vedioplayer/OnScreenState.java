package com.j2.state.vedioplayer;

public class OnScreenState implements State{
	 VedioPlayer vp;

	  public OnScreenState(VedioPlayer vp){
	    this.vp=vp;
	  }
	  public void playVedio(){
		  System.out.println("It's already started");
	      vp.setState(vp.getPlayingState());
	  }
	  public void stopVedio(){
	    System.out.println("Vedio didn't start. So You can't stop");
	  }
	  public void endVedio(){
	    System.out.println("Vedio didn't start. So You can't end");
	  }
	  public void replayVedio(){
	    System.out.println("Vedio didn't start. So You can't replay");
	  }
	  public String toString() {
	      return "Screen is on";
	  }
}
