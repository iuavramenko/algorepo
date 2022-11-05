package com.algo.telran.algo.recur;

public class App {

    public static void main(String[] args) {

        char[] arr = new char[] {'h','e','l','l','o'};   //'h'->'e'->'l'->'l'->'o'->null

        //T O(N)
        //S O(1)
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.print(" " + arr[i]);
        }

        //T O(N)
        //S O(N)
        System.out.println();
        print(0,arr);


    }

    public static void print(int index, char[] arr) {
        if(arr == null || index >= arr.length) {
            return;

        }

        print(index ,arr);
        System.out.print(" " + arr[index]);
    }                                                                       ///m1
}                                                                           ///////////////////////////
