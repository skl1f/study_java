package com.ukrgadget;

/**
 * Created by skl1f on 24.03.15.
 * Bubble Sorting {asc,desc,reverse} elements in array
 */

public class Sorting {

        public static void sortDesc(int[] data) {
            for (int border = data.length; border > 0; --border) {
                for (int index = border - 1; index > 0; index--) {
                    if (data[index - 1] < data[index]) {
                        swap(data, index, index - 1);
                    }
                }
            }
        }

        public  static void sortAsc(int[] data){
            for (int border = data.length; border > 0; --border){
                for (int index = 0; index < border - 1; index++){
                    if (data[index] > data[index+1]) {
                        swap(data, index + 1, index);
                    }
                }
            }
        }

        public static void reverse (int[] data){
            for (int i = 0; i < data.length/2; i++){
                swapForReverse(data, i);
            }
        }

        private static void swapForReverse(int[] data, int i) {
            int tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
    
        private static void swap(int[] array, int one, int two) {
            int tmp = array[one];
            array[one] = array[two];
            array[two] = tmp;
        }
    }
