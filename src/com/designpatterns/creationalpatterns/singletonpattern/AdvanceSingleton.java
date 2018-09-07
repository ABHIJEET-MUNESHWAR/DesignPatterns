package com.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 27/03/17
 * Time: 11:13 PM
 */
public class AdvanceSingleton {
    private static volatile AdvanceSingleton instance = null;

    /**
     * To avoid creation of new instance on reflection
     *
     * @throws IllegalStateException
     */
    private AdvanceSingleton() throws IllegalStateException {
        if (instance != null) {
            throw new IllegalStateException("Instance is already available.");
        }
    }

    /**
     * To avoid creation of new instance on serialization
     *
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone is not allowed");
    }

    public static AdvanceSingleton getInstance() {
        if (instance == null) {
            synchronized (AdvanceSingleton.class) {
                if (instance == null) {
                    instance = new AdvanceSingleton();
                }
            }
        }
        return instance;
    }
}
