package com.file1.sort;

public class SortTest {
    public SortTest() {
        Sort sort = new Sort();
        long timeB = sort.bubbleSort();
        long timeS = sort.selectionSort();
        long timeQ = sort.quickSort();
        System.out.println((timeQ < timeB) && (timeQ < timeS) ? "Quick sort the fastest" :
                (timeS < timeQ) && (timeS < timeB) ? "Selection sort the fastest" :
                        "Bubble sort the fastest");
    }
}
