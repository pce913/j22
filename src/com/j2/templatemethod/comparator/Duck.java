package com.j2.templatemethod.comparator;

public class Duck{
	  String name;
	    int weight;
	  public Duck(String name,int weight){
	    this.name=name;
	    this.weight=weight;
	  }
	  public String toString(){
	    return name+" weights "+ weight;
	  }
	  public int getWeight(){
		  return weight;
	  }
	}