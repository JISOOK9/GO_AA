package Behavior.strategy.duck;

public class FlyHigh implements FlyBehavior {

  @Override
  public void fly() {
    System.out.print("fly high");
  }
}
