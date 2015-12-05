package com.j2.state.vedioplayer;

public class PlayingState implements State {
	 VedioPlayer vp;

	  public PlayingState(VedioPlayer vp){
	    this.vp=vp;
	  }
	  public void playVedio(){
	      System.out.println("It's already started");
	     // vp.setState(vp.getPlayingState());
	  }
	  public void stopVedio(){
	    System.out.println("Vedio is stopped");
	    vp.setState(vp.getStoppingState());
	  }
	  public void endVedio(){
	    System.out.println("Vedio is ended");
	    vp.setState(vp.getSleepingState());
	  }
	  public void replayVedio(){
	    System.out.println("It's already started");
	  }
	  public String toString() {
	      return "Vedio is playing";
	  }
}
