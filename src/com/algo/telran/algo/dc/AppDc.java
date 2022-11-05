package com.algo.telran.algo.dc;

public class AppDc {

    public static void main(String[] args) {

        int[] arr = {96, 20, 5, 15, 7, 156};   //18
        int[] arrOne = {};
        AppDc appDc = new AppDc();
        int maxElement = appDc.maxArray(arrOne, 0, arrOne.length);
        System.out.println("Max element = " + maxElement);
    }


    private int maxArray(int[] array, int index, int end) {
        if (array.length < 2) {
            return array.length == 0 ? -1 : array[0];
        }

        if (index == end - 1) {
            return array[index];
        }
        int mid = (end + index) / 2;
        int maxLeft = maxArray(array, index, mid);
        int maxRight = maxArray(array, mid, end);

        return Math.max(array[index], Math.max(maxLeft, maxRight));
    }
}
