package com.algo.telran.algo.dc;

public class AppUniArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 9, 12, 15, 14, 12, 10, 6};
        int[] arrOne = {1, 2, 4, 7, 9, 12, 15};
        int[] arrTwo = {12, 10, 9, 7, 5, 3, 2, 1};
        AppUniArray appUniArray = new AppUniArray();
        System.out.println("Max element = " + appUniArray.findMax(arr, 0, arr.length));
        System.out.println("Max element = " + appUniArray.findMax(arrOne, 0, arrOne.length-1));

    }

    private int findMax(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }
        if (right - left == 1) {
            return Math.max(array[left], array[right]);
        }
        int mid = (left + right) / 2;
        if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
            return array[mid];
        }

        if (array[mid] > array[mid - 1]) {
            return findMax(array, mid + 1, right);
        } else {
            return findMax(array, left, mid - 1);
        }
    }
}
