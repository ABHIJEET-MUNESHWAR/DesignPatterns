package com.designpatterns.creationalpatterns.factorymethodpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/12/16
 * Time: 10:09 PM
 */
abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
