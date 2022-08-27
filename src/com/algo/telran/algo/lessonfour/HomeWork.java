package com.algo.telran.algo.lessonfour;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
    //Task 1.1
    private static long pow(long x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        return x * pow(x, n - 1);
    }
}
