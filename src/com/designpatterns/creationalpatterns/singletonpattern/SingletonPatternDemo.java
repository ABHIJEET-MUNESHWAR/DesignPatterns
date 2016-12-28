package com.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 28/12/16
 * Time: 12:24 AM
 * https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
