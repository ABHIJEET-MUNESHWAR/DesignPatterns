package com.designpatterns.creationalpatterns.factorymethodpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/12/16
 * Time: 10:18 PM
 */
class InstitutionalPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.5;
    }
}
