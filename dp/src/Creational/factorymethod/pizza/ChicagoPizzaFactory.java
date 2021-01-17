package Creational.factorymethod.pizza;

public class ChicagoPizzaFactory extends PizzaFactory{
  @Override
  Pizza createPizza() {
    return new ChicagoPizza();
  }
}

