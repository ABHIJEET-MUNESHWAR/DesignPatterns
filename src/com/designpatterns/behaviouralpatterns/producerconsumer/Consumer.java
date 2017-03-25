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
public class Consumer implements Runnable {
    public final BlockingDeque<Integer> sharedQueue;

    public Consumer(BlockingDeque<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + sharedQueue.take());
            } catch (InterruptedException e) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
