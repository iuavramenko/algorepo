package com.algo.telran.algo.bs;

public class BinarySearch {

    public static void main(String[] args) {
        //10    12
        int[] arr = {-5, -2, -1, 0, 4, 6, 7, 8, 12, 15, 16, 21, 24, 30};

        int target = 30;

        System.out.println(search(arr, target));

    }

    private static int search(int[] arr, int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            count++;
            if (arr[mid] == target) {
                System.out.println(count);
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(count);
        return -1;
    }
}
