package com.designpatterns.behaviouralpatterns.observer;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 6:50 PM
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
