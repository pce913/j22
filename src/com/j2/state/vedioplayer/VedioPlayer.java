package com.j2.state.vedioplayer;

public class VedioPlayer {
	State onScreenState;
	State offScreenState;
	State playingState;
	State stoppingState;
	State sleepingState;
	State state=offScreenState;
	boolean isOn=false;
	  public VedioPlayer(boolean isOn){
	    this.isOn=isOn;
	    onScreenState=new OnScreenState(this);
	    offScreenState=new OffScreenState(this);
	    playingState=new PlayingState(this);
	    stoppingState=new StoppingState(this);
	    sleepingState=new SleepingState(this);
	    
	  
	  if(isOn==true){
	    state=onScreenState;
	    }
	  }
	  public void setState(State state){
	    this.state=state;
	  }
	  public State getState(){
	    return state;
	  }
	  public void playVedio(){
	    state.playVedio();
	  }
	  
	  public void stopVedio(){
	    state.stopVedio();
	  }
	  
	  public void endVedio(){
		  state.endVedio();
	  }
	  
	  public void replayVedio(){
		  state.replayVedio();
	  }
	  
	  public State getPlayingState(){
	    return playingState;
	  }
	  
	  public State getSleepingState(){
		    return sleepingState;
		  }
	  
	  public State getStoppingState(){
		    return stoppingState;
		  }
	  
	  public State  getOnScreenState(){
		  return onScreenState;
	  }
	 
	   
	 

}
