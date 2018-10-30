package com.designpatterns.behaviouralpatterns.trategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    30/10/18,
 * Time:    12:21 PM
 */
public class ShoppingCart {

  private List<Item> items;

  public ShoppingCart() {
    this.items = new ArrayList<>(items);
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

  public void removeItem(Item item) {
    this.items.remove(item);
  }

  public int calculateTotal() {
    int sum = 0;
    for (Item item : this.items) {
      sum += item.getPrice();
    }
    return sum;
  }

  public void pay(PaymentStrategy paymentStrategy) {
    int total = calculateTotal();
    paymentStrategy.pay(total);
  }
}
