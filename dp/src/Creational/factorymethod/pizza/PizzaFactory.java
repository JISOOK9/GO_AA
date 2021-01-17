package Creational.factorymethod.pizza;

public abstract class PizzaFactory {

  Pizza orderPizza() {
    Pizza pz = createPizza();
    pz.addToppings("cheese");
    pz.bake();
    return pz;
  }

  abstract Pizza createPizza();
}
