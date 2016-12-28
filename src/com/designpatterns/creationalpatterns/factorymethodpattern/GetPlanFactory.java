package com.designpatterns.creationalpatterns.factorymethodpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/12/16
 * Time: 10:22 PM
 */
class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equals("DomesticPlan")) {
            return new DomesticPlan();
        } else if (planType.equals("InstitutionalPlan")) {
            return new InstitutionalPlan();
        } else if (planType.equals("CommercialPlan")) {
            return new CommercialPlan();
        }
        return null;
    }
}
