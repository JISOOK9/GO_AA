package Creational.factorymethod.pizza;

public class ChicagoPizza extends Pizza {

  ChicagoPizza() {
    name = "Chicago pizza";
    price = 500;
  }
  @Override
  public void bake() {
    System.out.println("Bake chicago pizza");
  }
}
