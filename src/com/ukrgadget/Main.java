package com.ukrgadget;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] data = {1,9,157,5,0,0};
        int[] data2 = {0,3,6,8,9,10,245};
        System.out.print("Original array of data:\n" + Arrays.toString(data));
        Loop.sortDesc(data);
        System.out.print("\nOrder by desc array of data:\n" + Arrays.toString(data));
        Loop.sortAsc(data);
        System.out.print("\nOrder by asc array of data\n" + Arrays.toString(data));
        Loop.reverse(data);
        System.out.println("\nReversed array of data:\n" + Arrays.toString(data));
        Loop.sortAsc(data);
        Loop.sortAsc(data2);
        System.out.println("Merge two sorted array:\n"+ "--data:\n" + Arrays.toString(data)+ "\n--data2:\n" + Arrays.toString(data2));
        int[] result = Loop.mergeSort(data,data2);
        System.out.println("----Merged arrays:");
        System.out.println(Arrays.toString(result));
        Loop.reverse(data);
        System.out.println("State before selection sort:");
        Loop.reverse(result);
        System.out.println(Arrays.toString(result));
        System.out.println("Selection sort:");
        Loop.selectionSort(result);
        System.out.println(Arrays.toString(result));
        int[] data3 = {1,3,4,325,235,15,7,257,0,0,4,4,6};
        System.out.println("Array before insertion sorting:\n" + Arrays.toString(data3));
        Loop.insertionSort(data3);
        System.out.println("Array after insertion sorting: \n" + Arrays.toString(data3));

        System.out.println("Recursion test");
        System.out.println(Recursion.fib(100));
    }

}