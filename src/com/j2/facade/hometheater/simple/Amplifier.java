package com.j2.facade.hometheater.simple;

public class Amplifier{
  private String description;
  private Tuner tuner;
  private DvdPlayer dvd;
  private int level;
  public Amplifier(String description) {
        this.description = description;
    }
  public void on(){
    System.out.println(description+" on");
  }
  public void off(){
    System.out.println(description+" off");
  }
  public void setDvd(DvdPlayer dvd){
    System.out.println(description+" setting dvd");
    this.dvd=dvd;
  }
  public void setTuner(Tuner yuner){
    System.out.println(description+" setting tuner");
    this.tuner=tuner;
  }
  public void setVolume(int level){
    System.out.println(description+" setting volume" + level);
    this.level=level;
  }
  public String toString() {
        return description;
    }
}
