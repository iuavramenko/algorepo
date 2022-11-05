package com.algo.telran.algo.lessonmostpopularpatterns;

public class SlidingWindows {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int n = 3;   // 1 <= n <= arr.length
        //2,1,5 = 8   1,5,1  = 7   5,1,3 = 9   1,3,2  = 6

        // i = 0; i =2;     i = 1 ; i = 3;    i = 2; i = 4;    i=3; i = 5;
        SlidingWindows slidingWindows = new SlidingWindows();
        int sum = slidingWindows.maxSumSubArrayFixedSize(arr, n);
        System.out.println("Maximum sum = " + sum);

        int[] array = {2,1,5,1,3,2};
        int target = 7;
        int minLength = slidingWindows.minSizeSubArraySum(array, target);
        System.out.println("Min subarray length = " + minLength);

        // cbbebi
    }

    private int minSizeSubArraySum(int[] array , int target) {
        int sum = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
            while (sum >= target) {
                len = Math.min(len, i - start + 1);
                sum -= array[start];
                start++;
            }
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }


    //Time complexity O(N)
    //Space complexity O(1)
    private int maxSumSubArrayFixedSize(int[] arr, int n) {
        int sum = 0;
        int max = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= n - 1) {
                max = Math.max(max, sum);
                sum -= arr[start++];
            }
        }
        return max;
    }
}
