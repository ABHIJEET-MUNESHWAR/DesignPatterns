package com.designpatterns.behaviouralpatterns.strategy.socialmedia;

/**
 * Created by abhijeet on 27/02/20 at 4:09 PM using IntelliJ IDEA.
 */
public class SocialMediaContext {

  SocialMediaStrategyService socialMediaStrategyService;

  public void setSocialMediaStrategyService(
      SocialMediaStrategyService socialMediaStrategyService) {
    this.socialMediaStrategyService = socialMediaStrategyService;
  }

  public void connect(String friendName) {
    socialMediaStrategyService.connectTo(friendName);
  }
}
