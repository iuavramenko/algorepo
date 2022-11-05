package com.algo.telran.algo.sort;

import java.util.Arrays;

public class AppSelectionSort {

    public static void main(String[] args) {

        int[] array = {7, 2, 3, 5, 6, 1, 10, 8, 0};

        // 0
        //10, 2, 3, 5, 6, 1, 7, 8, 0


        // 1
        //10, 2, 3, 5, 6, 1, 7, 8, 0
        // array[1] = 2 , array[2] = 3, array[3] = 5,array[4] = 6,array[6] = 7,  array[7] = 8,
        // maxPos = 7;
        //10, 2, 3, 5, 6, 1, 7, 8, 0
        //10, 8, 3, 5, 6, 1, 7, 2, 0
        //
        for (int j = 0; j < array.length; j++) {
            int maxPos = j;
            System.out.print("Start position = " + j+ " ");
            System.out.print(Arrays.toString(array) + " ");
            for (int i = j; i < array.length; i++) {
                if (array[i] > array[maxPos]) {
                    maxPos = i;
                }
            }
            System.out.print(", Max position = " + maxPos + " ");
            int temp = array[j];
            array[j] = array[maxPos];
            array[maxPos] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
