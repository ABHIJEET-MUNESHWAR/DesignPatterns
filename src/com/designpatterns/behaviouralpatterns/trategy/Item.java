package com.designpatterns.behaviouralpatterns.trategy;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    30/10/18,
 * Time:    12:10 PM
 */
public class Item {
  private String upcCode;
  private int price;

  public Item(String upcCode, int price) {
    this.upcCode = upcCode;
    this.price = price;
  }

  public String getUpcCode() {
    return upcCode;
  }

  public void setUpcCode(String upcCode) {
    this.upcCode = upcCode;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
