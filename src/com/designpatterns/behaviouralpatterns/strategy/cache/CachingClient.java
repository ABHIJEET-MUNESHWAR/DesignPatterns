package com.designpatterns.behaviouralpatterns.strategy.cache;


/*
    Created using IntelliJ IDEA
    Author: Abhijeet Ashok Muneshwar
    Date:   07-02-2025
    Time:   07:06 pm
*/

public class CachingClient {
    public static void main(String[] args) {
        CachingContext cachingContext = new CachingContext(new LRUCachingStrategy());
        cachingContext.performGet(1);
        cachingContext.performPut(1, 1);

        cachingContext = new CachingContext(new LFUCachingStrategy());
        cachingContext.performGet(1);
        cachingContext.performPut(1, 1);
    }
}
