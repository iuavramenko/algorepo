package com.algo.telran.algo.lessonmostpopularpatterns;

import java.util.Arrays;

public class TwoPointers {

    public static void main(String[] args) {
        TwoPointers twoPointers = new TwoPointers();
        //1. Reverse string
        String text = "absbdfgh";
        twoPointers.reverseString(text);
        //2. Return array of squares sorted on non-decreasing order
        int[] arr = {-3, -1, 0, 1, 2};   /// -100 < arr[n] < 100 , arr.length < 1000
        twoPointers.sqrSortedArray(arr);
        //3. Remove duplicates from sorted array (in-place)
        // {2,3,3,3,6,9,9}  -> {2,3,6,9}
        int[] array = {2, 3, 3, 3, 6, 9, 9};
        twoPointers.removeDuplicatesFromSortedArray(array);
        //4.   [2,4,5,6,8,9] target = 7;


    }

    private void removeDuplicatesFromSortedArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                arr[++slow] = arr[fast];
            }
        }
        System.out.println("Count non duplicates elements = " + (slow + 1));
        System.out.println("Array without duplicates" + Arrays.toString(arr));
    }

    private void sqrSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] sqrt = new int[arr.length];
        int idx = sqrt.length - 1;
        while (idx >= 0) {
            int sqrtL = arr[left] * arr[left];   // long if needs
            int sqrtR = arr[right] * arr[right]; // long if needs
            if (sqrtR > sqrtL) {
                sqrt[idx] = sqrtR;
                right--;
            } else {
                sqrt[idx] = sqrtL;
                left++;
            }
            idx--;
        }
        System.out.println("Squares " + Arrays.toString(sqrt));
    }

    //Time complexity O(n)
    //Space complexity O(n)
    private void reverseString(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        System.out.println("Reverse string " + new String(chars));
    }

}
