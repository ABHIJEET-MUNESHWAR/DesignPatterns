package com.designpatterns.behaviouralpatterns.strategy.cache;


/*
    Created using IntelliJ IDEA
    Author: Abhijeet Ashok Muneshwar
    Date:   07-02-2025
    Time:   07:05 pm
*/

public class LFUCachingStrategy implements CachingStrategy{
    @Override
    public int get(int key) {
        System.out.println("Performing Get of LRU Cache.");
        return 0;
    }

    @Override
    public void put(int key, int value) {
        System.out.println("Performing PUT of LRU Cache.");
    }
}
