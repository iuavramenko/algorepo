package com.algo.telran.algo.lessonfive.quicksort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        //int[] array = {0, 56, 22, 78, 9, 3, 5, -1};
        int[] array = {8, 9, 6, 15, 1, 16, 10};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedArray = Arrays.copyOf(array, array.length);

        quickSort(array, 0, array.length - 1);
        System.out.println("QS :" + Arrays.toString(array));

        Arrays.sort(expectedArray);
        System.out.println("QS inner:" + Arrays.toString(expectedArray));

    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int indexPivot = getIndexPivotMiddle(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }

    private static int getIndexPivotMiddle(int[] array, int start, int end) {
        int mid = start + (end - start) / 2;
        //int mid = end;
        int pivot = array[mid];
        int indexPivot = mid; // index 0

        while (start < end) {
            while (array[start] < pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(array, start, end);
                if (end == indexPivot) {
                    indexPivot = start;
                } else if (start == indexPivot) {
                    indexPivot = end;
                }
                start++;
                end--;
            }
        }

        if (start < indexPivot && array[start] > array[indexPivot]) {
            swap(array, indexPivot, start);
            indexPivot = start;
        } else if (end > indexPivot && array[end] < array[indexPivot]) {
            swap(array, indexPivot, end);
            indexPivot = end;
        }

        return indexPivot;
    }


    private static int getIndexPivot(int[] array, int start, int end) {
        int mid = start + (end - start) / 2;
        int pivot = array[mid]; // 15
        int indexPivot = start; // index 0


        //{*34, 56, 22, 78, 9, 3, 5, 15}
        //{9,*56, 22, 78, 34, 3, 5, 15}
        //{9,3,*22, 78, 34, 56, 5, 15}
        //{9, 3, 5, *78, 34, 56, 22, 15}

        //{9, 3, 5, *15, 34, 56, 22, 78}

        // left = start;
        // right = end;
        //while(left < right)
        // 1. Если в левой части элементы меньше чем опорный (array[left] < pivot ) то , пропускаем left++
        // 2. Если в право части элементы больше чем опорный (array[right] > pivot ) то , пропускаем right++
        // 3. array[left] > pivot && array[right] < pivot
        // swap elements from left to right and vice versa
        // swap array[mid] and array[left]


        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, indexPivot, i);
                indexPivot++;
            }
        }
        swap(array, indexPivot, end);
        return indexPivot;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
