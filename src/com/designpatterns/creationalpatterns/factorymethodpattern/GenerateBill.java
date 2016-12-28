package com.designpatterns.creationalpatterns.factorymethodpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/12/16
 * Time: 10:26 PM
 * http://www.javatpoint.com/factory-method-design-pattern
 */

import java.util.*;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Scanner sc = new Scanner(System.in);
        String planName = sc.next();
        int units = sc.nextInt();
        Plan p = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
