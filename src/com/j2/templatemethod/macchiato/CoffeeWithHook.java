package com.j2.templatemethod.macchiato;
import java.util.*;

public class CoffeeWithHook extends CaffeinBeverageWithHook{
	
	public CoffeeWithHook(){
		beverage="espresso";
	}

  public void brew(){
    System.out.println("Dripping");
  }
  public void addCondiments(){
    System.out.println("Adding vanilla syrup+milk+caramel");
    beverage="caramelMacchiato";
  }
  
  public boolean customerWantsCondiments(){
    String answer=null;
    System.out.print("Do you want CaramelMacchiato? (y/n) : ");
    
    Scanner scanner=new Scanner(System.in);
    answer=scanner.next();
    
   
    if(answer.toLowerCase().startsWith("y"))
      return true;
    else
      return false;
  }
}