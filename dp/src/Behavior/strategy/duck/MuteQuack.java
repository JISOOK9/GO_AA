package Behavior.strategy.duck;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Muted Quack");
  }
}
