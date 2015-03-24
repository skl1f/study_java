package com.ukrgadget;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] data = {1,9,157,5,0,0};
        int[] data2 = {0,3,6,8,9,10,245};
        System.out.print("Original array of data:\n" + Arrays.toString(data));
        Sorting.sortDesc(data);
        System.out.print("\nOrder by desc array of data:\n" + Arrays.toString(data));
        Sorting.sortAsc(data);
        System.out.print("\nOrder by asc array of data\n" + Arrays.toString(data));
        Sorting.reverse(data);
        System.out.println("\nReversed array of data:\n" + Arrays.toString(data));
        Sorting.sortAsc(data);
        Sorting.sortAsc(data2);
        System.out.println("Merge two sorted array:\n"+ "--data:\n" + Arrays.toString(data)+ "\n--data2:\n" + Arrays.toString(data2));
        int[] result = Sorting.mergeSort(data,data2);
        System.out.println("----Merged arrays:");
        System.out.println(Arrays.toString(result));
    }

}