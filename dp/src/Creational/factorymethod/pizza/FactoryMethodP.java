package Creational.factorymethod.pizza;


public class FactoryMethodP {

  public FactoryMethodP() {
    PizzaFactory store = new NewyorkPizzaFactory();
    store.orderPizza();
    store = new ChicagoPizzaFactory();
    store.orderPizza();
  }
}
