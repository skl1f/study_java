package com.ukrgadget;

public class Recursion {
    public static void f (int i){
        System.out.print(" " + i);
        if (i < 7) {
            f(i+1);
        }
        System.out.print(" " + i);
    }

    public static int fib(int num) {
        if (num == 0) {
            return num;
        }
        return  num + fib(num-1);
    }
}