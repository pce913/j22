package com.j2.templatemethod.comparator;
import java.util.*;

public class DuckSortTestDrive {
	public static void main(String[] args) {
	  List<Duck> ducks=new ArrayList<Duck>();
	  ducks.add(new Duck("Daffy",8));
	  ducks.add(new Duck("Dewey",2));
	  ducks.add(new Duck("Howar",7));
	  ducks.add(new Duck("Park",14));
	  ducks.add(new Duck("Lee",9));
	  ducks.add(new Duck("Kim",5));
	  Collections.sort(ducks,new AscCompare());
	  display(ducks);
	}
	 private static void display(List<Duck> ducks) {
		 Iterator it=ducks.iterator();
		 while(it.hasNext()==true){
			 System.out.println(it.next());
		 }
		}
}
