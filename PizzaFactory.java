package com.comp301.a07pizza;

import com.comp301.a07pizza.Pizza.Size;
import java.util.ArrayList;

public class PizzaFactory {
  public static Pizza makeCheesePizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    Crust cheeseCrust = Crust.HAND_TOSSED;
    Sauce cheeseSauce = Sauce.TOMATO;
    Cheese cheeseCheese = Cheese.BLEND;
    return new PizzaImpl(size, cheeseCrust, cheeseSauce, cheeseCheese, toppings);
  }

  public static Pizza makeHawaiianPizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.HAM);
    toppings.add(Topping.PINEAPPLE);
    return new PizzaImpl(size, Crust.HAND_TOSSED, Sauce.TOMATO, Cheese.BLEND, toppings);
  }

  public static Pizza makeMeatLoversPizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.PEPPERONI);
    toppings.add(Topping.SAUSAGE);
    toppings.add(Topping.BACON);
    toppings.add(Topping.GROUND_BEEF);
    return new PizzaImpl(size, Crust.DEEP_DISH, Sauce.TOMATO, Cheese.BLEND, toppings);
  }

  public static Pizza makeVeggieSupremePizza(Size size) {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.SUN_DRIED_TOMATO);
    toppings.add(Topping.GREEN_PEPPER);
    toppings.add(Topping.MUSHROOMS);
    toppings.add(Topping.OLIVES);
    return new PizzaImpl(size, Crust.THIN, Sauce.TOMATO, Cheese.BLEND, toppings);
  }

  public static Pizza makeDailySpecialPizza() {
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    toppings.add(Topping.BUFFALO_CHICKEN);
    toppings.add(Topping.JALAPENO);
    toppings.add(Topping.SPINACH);
    return new PizzaImpl(Pizza.Size.MEDIUM, Crust.DEEP_DISH, Sauce.TOMATO, Cheese.BLEND, toppings);
  }
}
