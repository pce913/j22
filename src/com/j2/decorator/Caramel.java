package com.j2.decorator;

public class Caramel extends ComdimentDecorator{
	public Caramel(Beverage beverage){
		this.beverage=beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Caramel";
	}


	public double cost() {
		return  .15+beverage.cost();
	}
	
}
