package com.ukrgadget;

/**
 * Created by skl1f on 24.03.15.
 * Recursion examples
 */
public class Recursion {
    public static void f (int i){
        System.out.print(" " + i);
        if (i < 7) {
            f(i+1);
        }
        System.out.print(" " + i);
    }

    public static int fib (int num){
        System.out.println("--"+ num);
        return  (num < 2) ? num: fib(num - 2) + fib(num - 1);
    }

    public static int fib_(int num) {
        if (num == 0) {
            return num;
        }
        return  num + fib_(num - 1);
    }
}