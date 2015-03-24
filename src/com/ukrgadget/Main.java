package com.ukrgadget;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] data = {1,9,157,5,0,0};
        System.out.print("Original array of data:\n" + Arrays.toString(data));
        Sorting.sortDesc(data);
        System.out.print("\nOrder by desc array of data:\n" + Arrays.toString(data));
        Sorting.sortAsc(data);
        System.out.print("\nOrder by asc array of data\n" + Arrays.toString(data));
        Sorting.reverse(data);
        System.out.print("\nReversed array of data:\n" + Arrays.toString(data));
    }

}