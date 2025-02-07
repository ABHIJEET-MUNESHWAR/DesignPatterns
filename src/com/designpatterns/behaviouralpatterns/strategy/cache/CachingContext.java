package com.designpatterns.behaviouralpatterns.strategy.cache;


/*
    Created using IntelliJ IDEA
    Author: Abhijeet Ashok Muneshwar
    Date:   07-02-2025
    Time:   07:02 pm
*/

public class CachingContext {
    private CachingStrategy cachingStrategy;

    public CachingContext(CachingStrategy cachingStrategy) {
        this.cachingStrategy = cachingStrategy;
    }

    public void setCachingStrategy(CachingStrategy cachingStrategy) {
        this.cachingStrategy = cachingStrategy;
    }

    public int performGet(int key) {
        return cachingStrategy.get(key);
    }

    public void performPut(int key, int value) {
        cachingStrategy.put(key, value);
    }

}
