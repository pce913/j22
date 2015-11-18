package com.j2.templatemethod.sort;

import java.util.Arrays;

public class DuckSortTestDrive{
  public static void main(String args[]){
    Duck[] ducks={new Duck("Daffy",8),new Duck("Dewey",2),new Duck("Howar",7)};
    Arrays.sort(ducks);
    display(ducks);
  }
  public static void display(Duck[] ducks){
    for(int i=0;i<ducks.length;i++)
      System.out.println(ducks[i]);
  }
}