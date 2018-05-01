package com.designpatterns.creationalpatterns.factorymethodpattern.shapedemo;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    01/05/18,
 * Time:    8:13 PM
 */
public class FactoryPatternDemo {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circleShape = shapeFactory.getShape("circle");
    circleShape.draw();
    Shape squareShape = shapeFactory.getShape("square");
    squareShape.draw();
    Shape triangleShape = shapeFactory.getShape("triangle");
    triangleShape.draw();
  }
}
