package Behavior.strategy.duck;

public class MallardDuck extends Duck{
  private int age;

  @Override
  public void display() {
    System.out.println("mallard duck`s display");
  }

  @Override
  public void setFlyBehavior() {
    flyBhv = new FlyHigh();
  }

  @Override
  public void setQuackBehavior() {
  }
}
