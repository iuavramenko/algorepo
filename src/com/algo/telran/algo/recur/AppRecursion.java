package com.algo.telran.algo.recur;

public class AppRecursion {

    public static void main(String[] args) {
        int[] arr = {9, 20, 15, 15, 7, 14};   //18

        AppRecursion appRecursion = new AppRecursion();
        int summArray = appRecursion.summArray(arr, arr.length - 1);
        System.out.println("Summ = " + summArray);

        int maxElement = appRecursion.maxArray(arr, arr.length - 1);
        System.out.println("Max element = " + maxElement);

        System.out.println(appRecursion.pow(2, 16));
    }

    private long pow(long x, long n) {
        //базовый случай
        if (n == 0) {
            return 1;
        }
        //Вызываем метод рекурсивно, каждый раз
        //уменьшая то количество раз в которое нужно возвести
        //в степень вдвое.
        //таким образом , для степени 16 , будет всего 6 вызовов, вместо 15
        long result = pow(x, n / 2);
        //когда показатель степени уменьшился, что наступил базовый случай
        //начинаем перемножать число между собой.
        if (n % 2 == 0) {
            //если n четное то просто перемножаем между собой
            return result * result;
        } else {
            //если n нечетное то перемножаем между собой и добавляем еще одно умножение
            return result * result * x;
        }
    }

    private int maxArray(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }

        int element = maxArray(array, index - 1);
        return Math.max(array[index], element);
    }

    private int summArray(int[] array, int index) {
        if (index < 0) {
            return 0;
        }
        if (index == 0) {
            return array[0];
        }

        int summ = summArray(array, index - 1);
        return array[index] + summ;
    }
}
