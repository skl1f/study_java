package com.ukrgadget.topic1;

import com.ukrgadget.Loop;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by skl1f on 04.07.15.
 * http://red.ukrgadget.com/issues/3
 */

public class task1 {
    public static void main(String[] args) {
        int[] data = new int[100];

        Random r = new Random();

        for (int x = 0; x < 100; x = x + 1)
        {
            data[x] = r.nextInt();
        }

        Loop.sortAsc(data);

        System.out.println(Arrays.toString(data));
    }
}
