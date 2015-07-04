package com.ukrgadget.topic1;

/**
 * Created by skl1f on 04.07.15.
 * http://red.ukrgadget.com/issues/4
 */

public class task2 {

    public static void main(String[] args) {

        FindMaxMinInt();
        FindMaxMinByte();
        FindMaxMinChar();
    }

    public static void FindMaxMinInt()
    {
        int minInt = 0;
        int maxInt;

        int i = Integer.MIN_VALUE;
        do {
            if (i < minInt)
                minInt = i;
            else
                i++;
            maxInt = i;
        } while (i != Integer.MAX_VALUE);

        System.out.println("Min int: " + minInt + " | Max int: " + maxInt);
    }

    public static void FindMaxMinByte()
    {
        byte minByte = 0;
        byte maxByte = 0;

        byte i = Byte.MIN_VALUE;

        while (i != Byte.MAX_VALUE)
        {
            if (minByte < i)
                minByte = i;
            else {
                i++;
                maxByte = i;
            }
        }

        System.out.println("Min byte: " + minByte + " | Max byte: " + maxByte);
    }

    public static void FindMaxMinChar()
    {
        char minChar = 0;
        char maxChar = 0;

        for(char x = Character.MIN_VALUE; x < Character.MAX_VALUE; x++)
        {
            if (x < minChar)
                minChar = x;
            else
                maxChar = x;
        }
        maxChar++;

        System.out.println("Min char: " + minChar + " | Max char: " + maxChar);
    }
}
