package com.designpatterns.behaviouralpatterns.producerconsumer;

import java.util.concurrent.BlockingDeque;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 24/03/17
 * Time: 11:08 PM
 */
public class Producer implements Runnable {
    private final BlockingDeque<Integer> sharedQueue;

    public Producer(BlockingDeque<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
