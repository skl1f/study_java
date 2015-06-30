package com.ukrgadget;

/**
 * Created by skl1f on 30.06.15.
 */

public class Test {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 12345;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 65432;

        public B(int f1) {
            super(f1);
        }
        protected void initialize() {
            System.out.println(f1);
        }
    }
}