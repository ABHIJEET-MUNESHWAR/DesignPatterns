package com.designpatterns.behaviouralpatterns.strategy.socialmedia;

/**
 * Created by abhijeet on 27/02/20 at 4:13 PM using IntelliJ IDEA.
 * Exasmple from https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/
 */
public class SocialMediaConnection {

  public static void main(String[] args) {
    SocialMediaContext socialMediaContext = new SocialMediaContext();

    socialMediaContext.setSocialMediaStrategyService(new FacebookStrategy());
    socialMediaContext.connect("Rohini");

    socialMediaContext.setSocialMediaStrategyService(new TwitterStrategy());
    socialMediaContext.connect("Mahi");

    socialMediaContext.setSocialMediaStrategyService(new InstagramStrategy());
    socialMediaContext.connect("Nishoo");
  }

}
