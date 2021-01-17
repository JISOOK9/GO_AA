package Creational.factorymethod.pizza;

public class NewyorkPizza extends Pizza{

  NewyorkPizza() {
    name = "ny pizza";
    price = 100;
    toppings.add("tomato");
  }
  @Override
  public void bake() {
    System.out.println("Bake newyork pizza");
  }
}
