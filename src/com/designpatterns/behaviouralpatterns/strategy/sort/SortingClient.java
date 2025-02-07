package com.designpatterns.behaviouralpatterns.strategy.sort;


/*
    Created using IntelliJ IDEA
    Author: Abhijeet Ashok Muneshwar
    Date:   07-02-2025
    Time:   06:56 pm
*/

public class SortingClient {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 3};
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        sortingContext.performSort(nums);

        sortingContext = new SortingContext(new MergeSortStrategy());
        sortingContext.performSort(nums);

        sortingContext = new SortingContext(new QuickSortStrategy());
        sortingContext.performSort(nums);
    }
}
