package com.algo.telran.algo.sort;

import java.util.Arrays;

public class AppBubbleSort {

    public static void main(String[] args) {

        //   2 10 3 5 6 1 7 8 0
        //   2 3 10 5 6 1 7 8 0
        //   2 3 5 6 1 7 8 0 10 - 1
        //   2 3 5 6 1 7 8 0 10 - 1
        //   2 3 5 1 6 7 8 0 10 - 1
        //   2 3 5 1 6 7 0 8 10 - 2

        //   2 3 5 1 6 7 0 8 10 - 2
        //   2 3 1 5 6 7 0 8 10 - 2
        //   2 3 1 5 6 0 7 8 10 - 3

        //   2 1 3 5 0 6 7 8 10 - 4
        //   1 2 3 0 5 6 7 8 10 - 5
        //   1 2 0 3 5 6 7 8 10 - 6
        //   1 0 2 3 5 6 7 8 10 - 7
        //   0 1 2 3 5 6 7 8 10 - 8

        int[] array = new int[]{10, 2, 3, 5, 6, 1, 7, 8, 0};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
