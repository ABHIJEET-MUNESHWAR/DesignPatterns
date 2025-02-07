package com.designpatterns.behaviouralpatterns.strategy.cache;


/*
    Created using IntelliJ IDEA
    Author: Abhijeet Ashok Muneshwar
    Date:   07-02-2025
    Time:   07:01 pm
*/

public interface CachingStrategy {
    public int get(int key);
    public void put(int key, int value);
}
