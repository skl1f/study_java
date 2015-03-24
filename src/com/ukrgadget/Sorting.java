package com.ukrgadget;

/**
 * Created by skl1f on 24.03.15.
 * Sorting {asc,desc,reverse, merge, selection} elements in array
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
                swap(data, i, data.length - 1 - i);
            }
        }

        public static int[] mergeSort(int[] one, int[] second){
            // Both of arrays should be sorted
            int[] mergedArray = new int[one.length + second.length];
            int lastIndexOne = 0;
            int lastIndexSecond = 0;

            while (lastIndexOne < one.length && lastIndexSecond < second.length) {
                if (one[lastIndexOne] < second[lastIndexSecond]) {
                    mergedArray[lastIndexOne + lastIndexSecond] = one[lastIndexOne++];
                } else {
                    mergedArray[lastIndexOne + lastIndexSecond] = second[lastIndexSecond++];
                }
            }
            if (lastIndexOne == one.length) {
                for (; lastIndexSecond < second.length;){
                    mergedArray[lastIndexOne + lastIndexSecond] = second[lastIndexSecond++];
                }
            } else {
                for (; lastIndexOne < one.length;){
                    mergedArray[lastIndexOne + lastIndexSecond] = one[lastIndexOne++];
                }
            }
            return mergedArray;
        }

        public static void selectionSort (int[] data){
            for (int index = 0; index < data.length -1; index++){
               int currentElementIndex = index;
               int currentElement = data[index];
                   for (int i = index; i < data.length;i++){
                       if (currentElement > data[i]) {
                           currentElementIndex = i;
                       }
                   }
                swap(data,currentElementIndex, index);
            }
        }

        public static void insertionSort (int[] numbers){
            for (int i = 1; i < numbers.length; i++) {
                int copyNumber = numbers[i];
                int j = i;
                while (j > 0 && copyNumber < numbers[j - 1]){
                    numbers[j] = numbers[j - 1];
                    j--;
                }
                numbers[j] = copyNumber;
            }
        }

        private static void swap(int[] array, int one, int two) {
            int tmp = array[one];
            array[one] = array[two];
            array[two] = tmp;
        }
    }
