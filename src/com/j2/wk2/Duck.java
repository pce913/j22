public abstract class Duck{
  public Duck(){}
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck(){}
  
  public void swim(){
      System.out.println("All ducks swim!");
   }
  abstract void display();
  public void performQuack(){
    quackBehavior.fly();
  }
  
  public void performFly(){
    flyBehavior.fly();
  }
  
  public void setFlyBehavior(FlyBehavior fb){
    flyBehavior=fb;
  }
  public void setQuackBehavior(QuackBehavior qb){
    fuqackBehavior=qb;
  }
}