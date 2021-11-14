package org.example.selectsort;

import org.example.tools.ArrayTools;

import java.util.Arrays;

public class SelectSort {
    private SelectSort() {
    }


    public static <T extends Comparable<T>> void selectSort(T[] data) {
        for (int i = 0; i < data.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < data.length; ++j) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            ArrayTools.swap(data, min, i);
        }
    }

    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        selectSort(data);
        System.out.println(Arrays.toString(data));
    }
}
