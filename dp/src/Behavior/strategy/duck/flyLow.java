package Behavior.strategy.duck;

public class flyLow implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Fly low");
  }
}
