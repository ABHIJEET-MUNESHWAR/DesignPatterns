package com.designpatterns.behaviouralpatterns.strategy;

/**
 * Created by abhijeet on 27/02/20 at 4:12 PM using IntelliJ IDEA.
 */
public class TwitterStrategy implements SocialMediaStrategyService {

  @Override
  public void connectTo(String friendName) {
    System.out.println("Connected to " + friendName + " through Twitter.");
    System.out.println("====================");
    System.out.println();
  }
}
