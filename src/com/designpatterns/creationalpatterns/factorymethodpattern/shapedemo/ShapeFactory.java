package com.designpatterns.creationalpatterns.factorymethodpattern.shapedemo;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    01/05/18,
 * Time:    8:11 PM
 */
public class ShapeFactory {

  public Shape getShape(String shape) {
    switch (shape) {
      case "circle":
        return new CircleShape();
      case "square":
        return new SquareShape();
      case "triangle":
        return new TriangleShape();
      default:
        return null;
    }
  }
}
