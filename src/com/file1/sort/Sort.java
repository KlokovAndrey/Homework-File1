package com.file1.sort;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Sort {
    private int n;  //array length
    int [] array; //array

    Sort(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input length: ");
        this.n = in.nextInt();
        array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=(int)(Math.random()*100);
        }

        System.out.println("Original array:");
        for(int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public long bubbleSort()
    {
        int [] arr = new int[n];
        System.arraycopy(array, 0, arr, 0, n);

        long timeBegin = System.nanoTime();
        for(int i = arr.length-1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        long timeEnd = System.nanoTime();
        System.out.println("Bubble sort:");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Time: "+(timeEnd-timeBegin));
        return timeEnd-timeBegin;
    }

    public long selectionSort(){
        int [] arr = new int[n];
        System.arraycopy(array, 0, arr, 0, n);

        long timeBegin = System.nanoTime();
        for (int i = 0; i < n; i++)
        {
            int min = arr[i];
            int minInd = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < min)
                {
                    min = arr[j];
                    minInd = j;
                }
            }
            if (i != minInd)
            {
                int tmp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = tmp;
            }
        }
        long timeEnd = System.nanoTime();
        System.out.println("Selection sort:");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Time: "+(timeEnd-timeBegin));
        return timeEnd-timeBegin;
    }


    public long quickSort(){
        int [] arr = new int[n];
        System.arraycopy(array, 0, arr, 0, n);

        long timeBegin = System.nanoTime();
        Arrays.sort(arr);
        long timeEnd = System.nanoTime();
        System.out.println("Quick sort:");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Time: "+(timeEnd-timeBegin));
        return timeEnd-timeBegin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sort sort = (Sort) o;
        return n == sort.n &&
                Arrays.equals(array, sort.array);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + n;
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}


