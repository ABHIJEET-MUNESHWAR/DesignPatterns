package com.designpatterns.creationalpatterns.factorymethodpattern.plandemo;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/12/16
 * Time: 10:17 PM
 */
class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 7.5;
    }
}
