package com.designpatterns.creationalpatterns.factorymethodpattern.shapedemo;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    01/05/18,
 * Time:    8:09 PM
 */
public class SquareShape implements Shape {

  @Override
  public void draw() {
    System.out.println("Square Shape");
  }
}
