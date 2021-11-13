package org.example.test.linearsearch;

import org.example.linearsearch.LinearSearch;
import org.example.tools.ArrayGenerator;

public class LinearSearchTest {


    public static void main(String[] args) {
        int size = 1000000;
        Integer[] orderedArray = ArrayGenerator.generatorOrderedArray(size);
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int result = LinearSearch.search(orderedArray, size - 1);
        }
        long endTime = System.nanoTime();
        double durTime = (endTime - startTime) / 1000000000.0;
        System.out.println("durTime = " + durTime);
    }

}
