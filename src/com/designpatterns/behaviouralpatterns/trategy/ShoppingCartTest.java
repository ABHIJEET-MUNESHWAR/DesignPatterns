package com.designpatterns.behaviouralpatterns.trategy;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    30/10/18,
 * Time:    2:21 PM
 */
public class ShoppingCartTest {

  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();
    Item item1 = new Item("1234", 10);
    Item item2 = new Item("5678", 20);
    shoppingCart.addItem(item1);
    shoppingCart.addItem(item2);
    shoppingCart.pay(new PaypalStrategy("openingknots@gmail.com", "password"));
    shoppingCart
        .pay(new CreditCardStrategy("Abhijeet Muneshwar", "1234567890123456", "123", "12/15"));
  }

}
