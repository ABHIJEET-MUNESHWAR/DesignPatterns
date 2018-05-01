package com.designpatterns.creationalpatterns.factorymethodpattern.plandemo;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/12/16
 * Time: 10:15 PM
 */
class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.5;
    }

}
