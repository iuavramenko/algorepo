package com.algo.telran.algo.lessonfive;

import java.util.Arrays;

public class MergeString {

    public static void main(String[] args) {
        String one = "abcde";    //  adbgckde
        String two = "dgk";
        System.out.println(new MergeString().mergeStrings(one, two));
    }

    private String mergeStrings(String one, String two) {
        int indexOne = 0;
        int indexTwo = 0;
        char[] resultArray = new char[one.length() + two.length()];
        boolean flag = false;
        for (int i = 0; i < one.length() + two.length(); i++) {
            if (indexOne < one.length() && indexTwo < two.length()) {
                if (!flag) {
                    resultArray[i] = one.charAt(indexOne++);
                } else {
                    resultArray[i] = two.charAt(indexTwo++);
                }
                flag = !flag;
            } else {
                if (indexOne < one.length()) {
                    resultArray[i] = one.charAt(indexOne++);
                }
                if (indexTwo < two.length()) {
                    resultArray[i] = two.charAt(indexTwo++);
                }
            }
        }
        return Arrays.toString(resultArray);
    }
}
