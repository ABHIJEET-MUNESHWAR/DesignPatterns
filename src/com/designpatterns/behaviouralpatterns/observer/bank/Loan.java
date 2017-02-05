package com.designpatterns.behaviouralpatterns.observer.bank;

import java.util.ArrayList;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 7:22 PM
 */
public class Loan implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String type;
    private float interest;
    private String bank;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
        notifyAllObservers();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Loan(String type, float interest, String bank) {
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        System.out
                .println("Notifying Observers on change in Loan interest rate");
        for (Observer observer : observers) {
            observer.update(this.interest);
        }
    }
}
