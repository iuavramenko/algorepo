package com.algo.telran.algo.lessonseven;

import java.util.Arrays;

public class Fib {

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Recur = " + rec(n));

        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = -1;
        }
        System.out.println("Memoization = " + fibonacciDPMemo(n, arr));

        System.out.println("Tabulation = " + fibonacciTab(n));
    }

    private static int rec(int n) {
        if (n < 2) {
            return n;
        }
        return rec(n - 1) + rec(n - 2);
    }

    private static int fibonacciDPMemo(int n, int[] arr) {
        if (n < 2) {
            return n;
        }
        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = fibonacciDPMemo(n - 1, arr) + fibonacciDPMemo(n - 2, arr);
        return arr[n];
    }

    private static int fibonacciTab(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (i == n) {
                return arr[i];
            }
        }

        return -1;
    }


}
