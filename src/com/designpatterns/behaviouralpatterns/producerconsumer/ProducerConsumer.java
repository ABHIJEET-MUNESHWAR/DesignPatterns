package com.designpatterns.behaviouralpatterns.producerconsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 24/03/17
 * Time: 11:08 PM
 * http://javarevisited.blogspot.in/2012/02/producer-consumer-design-pattern-with.html
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingDeque<Integer> sharedQueue = new LinkedBlockingDeque<>();
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread = new Thread(new Consumer(sharedQueue));
        prodThread.start();
        consThread.start();
    }
}
