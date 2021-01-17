package Behavior.strategy.duck;

public class StrategyP {
  private Duck duck;

  public StrategyP() {
    duck = new MallardDuck();
    duck.performQuack();
  }
}
