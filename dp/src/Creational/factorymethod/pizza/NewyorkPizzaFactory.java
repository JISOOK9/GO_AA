package Creational.factorymethod.pizza;

public class NewyorkPizzaFactory extends PizzaFactory{

  @Override
  Pizza createPizza() {
    return new NewyorkPizza();
  }
}
