package com.j2.decorator;

public abstract class ComdimentDecorator extends Beverage{
  Beverage beverage;
  public abstract String getDescription();
}