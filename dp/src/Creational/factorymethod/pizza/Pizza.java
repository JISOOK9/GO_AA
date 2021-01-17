package Creational.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  String name;
  int price;
  String sauce;
  List<String> toppings = new ArrayList<>();

  public void bake() {

  }
  public void addToppings(String topping) {
    toppings.add(topping);
    System.out.println("Add toppings : " + toppings.toString());
  }
}
