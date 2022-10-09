package org.example;

import java.util.Arrays;

public class MyQuickSort {


    public static void main(String[] args) {
        String str = "Hello my friend";

        char[] strArr = str.toLowerCase().toCharArray();
        quickSort(strArr, 0, strArr.length - 1);
        System.out.println(Arrays.toString(strArr));
    }

    public static int partition(char[] strArr, int start, int end) {
        if (strArr.length == 0 || start >= end) {
            return 0;
        }
        int counter = start;

        for (int i = start; i <= end; i++) {
            if (strArr[i] <= strArr[end]) {
                char temp = strArr[counter];
                strArr[counter] = strArr[i];
                strArr[i] = temp;
                counter++;
            }
        }
        return --counter;
    }

    public static void quickSort(char[] strArr, int start, int end) {
        if (end <= start) return;
        int pivot = partition(strArr, start, end);
        quickSort(strArr, start, pivot - 1);
        quickSort(strArr, pivot + 1, end);
    }
}
