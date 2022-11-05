package com.algo.telran.algo.recur;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        new ReverseString().reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        new ReverseString().reverse(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    public void reverseArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
    }

    public void reverse(int left, int right, char[] chars) {
        if (left >= right) {
            return;
        }
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
        reverse(++left, --right, chars);
    }
}