package com.designpatterns.creationalpatterns.builder;

/**
 * Created using IntelliJ IDEA
 * User: Abhijeet
 * Date: 04-04-2017
 * Time: 10:37 PM
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
    }
}
