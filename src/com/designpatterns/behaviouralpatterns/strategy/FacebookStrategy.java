package com.designpatterns.behaviouralpatterns.strategy;

/**
 * Created by abhijeet on 27/02/20 at 4:11 PM using IntelliJ IDEA.
 */
public class FacebookStrategy implements SocialMediaStrategyService {

  @Override
  public void connectTo(String friendName) {
    System.out.println("====================");
    System.out.println("Connected to " + friendName + " through Facebook.");
    System.out.println("====================");
    System.out.println();
  }
}
