package com.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 20/01/17
 * Time: 6:32 PM
 */
public final class LazySingleObject {
    private static volatile LazySingleObject instance = null;

    private LazySingleObject() {
        //
    }

    private static LazySingleObject getInstance() {
        if (instance == null) {
            synchronized (LazySingleObject.class) {
                instance = new LazySingleObject();
            }
        }
        return instance;
    }
}
