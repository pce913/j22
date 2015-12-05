package com.j2.state.vedioplayer;

public class StoppingState implements State {
	VedioPlayer vp;

	  public StoppingState(VedioPlayer vp){
	    this.vp=vp;
	  }
	  public void playVedio(){
	      System.out.println("Play the vedio from stopping mode");
	      vp.setState(vp.getPlayingState());
	  }
	  public void stopVedio(){
	    System.out.println("It is already stopped");
	    //vp.setState(vp.getStoppingState());
	  }
	  public void endVedio(){
	    System.out.println("Vedio is ended");
	    vp.setState(vp.getSleepingState());
	  }
	  public void replayVedio(){
	    System.out.println("It's already started");
	  }
	  public String toString() {
	      return "Vedio is stopping";
	  }
}
