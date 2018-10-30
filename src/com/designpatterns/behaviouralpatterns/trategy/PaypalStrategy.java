package com.designpatterns.behaviouralpatterns.trategy;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    30/10/18,
 * Time:    12:03 PM
 */
public class PaypalStrategy implements PaymentStrategy {
  private String emailId;
  private String password;

  public PaypalStrategy(String emailId, String password) {
    this.emailId = emailId;
    this.password = password;
  }

  @Override
  public void pay(Integer amount) {
    System.out.println(amount + " paid through PayPal.");
  }
}
