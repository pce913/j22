package com.j2.state.vedioplayer;

public class SleepingState implements State {
	VedioPlayer vp;

	  public SleepingState(VedioPlayer vp){
	    this.vp=vp;
	  }
	  public void playVedio(){
	      System.out.println("It's ended. So you can't play");
	      //vp.setState(vp.getPlayingState());
	  }
	  public void stopVedio(){
	    System.out.println("It's ended. So you can't stop");
	   // vp.setState(vp.getStoppingState());
	  }
	  public void endVedio(){
	    System.out.println("Already ended");
	  }
	  public void replayVedio(){
	    System.out.println("Replaying the vedio");
	    vp.setState(vp.getOnScreenState());
	  }
	  public String toString() {
	      return "Vedio is sleeping";
	  }
}
