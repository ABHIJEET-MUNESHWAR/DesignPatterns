package com.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 28/12/16
 * Time: 12:21 AM
 */
class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World !!!");
    }
}
