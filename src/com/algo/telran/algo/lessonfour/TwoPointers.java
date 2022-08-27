package com.algo.telran.algo.lessonfour;

public class TwoPointers {

    public static void main(String[] args) {
        int[] arrOne = {100, 112, 256, 349, 770};            //  100  //100  //100 // 112
        int[] arrTwo = {72, 86, 113, 119, 265, 445, 892};    //  72   //86   //113 // 113
        int k = 7;
        int kPositionElement = getKPositionElement(mergeArray(arrOne, arrTwo), k);
        System.out.println("Element on k position = " + kPositionElement);
    }


    private static int mergeArray(int[] one, int[] two, int k) {
        int length = one.length + two.length;
        int indexOne = 0;
        int indexTwo = 0;
        int curr = one[0];
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    indexOne++;
                    curr = elementOne;
                } else {
                    indexTwo++;
                    curr = elementTwo;
                }
                count++;

                if (count == k) {
                    return curr;
                }

                continue;
            }
            if (indexOne < one.length && indexTwo >= two.length) {
                curr = one[indexOne];
                count++;
                indexOne++;

            }
            if (indexOne >= one.length && indexTwo < two.length) {
                curr = two[indexTwo];

                indexTwo++;

            }
            count++;
            if (count == k) {
                return curr;
            }

        }

        throw new IllegalArgumentException();
    }

    private static int getKPositionElement(int[] array, int k) {
        return array[k - 1];
    }

    private static int[] mergeArray(int[] one, int[] two) {
        int[] result = new int[one.length + two.length];
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    result[i] = elementOne;
                    indexOne++;
                } else {
                    result[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            if (indexOne < one.length) {
                result[i] = one[indexOne];
                indexOne++;
            }
            if (indexTwo < two.length) {
                result[i] = two[indexTwo];
                indexTwo++;
            }
        }

        return result;
    }
}