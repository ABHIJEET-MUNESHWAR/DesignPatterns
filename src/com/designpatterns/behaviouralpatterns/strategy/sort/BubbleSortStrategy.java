package com.designpatterns.behaviouralpatterns.strategy.sort;


/*
    Created using IntelliJ IDEA
    Author: Abhijeet Ashok Muneshwar
    Date:   07-02-2025
    Time:   06:54 pm
*/

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] nums) {
        System.out.println("Sorting numbers using bubble sort...");
    }
}
