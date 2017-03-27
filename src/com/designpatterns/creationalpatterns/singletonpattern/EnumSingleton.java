package com.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/03/17
 * Time: 11:42 PM
 */
public enum EnumSingleton {
    INSTANCE;

    public void doStuff() {
        System.out.println("Do some task here.");
    }
}
