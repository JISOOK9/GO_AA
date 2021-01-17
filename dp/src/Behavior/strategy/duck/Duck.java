package Behavior.strategy.duck;

public abstract class Duck {
  FlyBehavior flyBhv;
  QuackBehavior quackBhv;

  public abstract void display();
  public abstract void setFlyBehavior();
  public abstract void setQuackBehavior();

  public void swim() {
    System.out.println("swim");
  }

  public void performFly(){
    flyBhv.fly();
  }

  public void performQuack(){
    quackBhv.quack();
  }
}
