package org.example.tools;

import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generatorOrderedArray(int size) {
        Integer[] data = new Integer[size];
        for (int i = 0; i < size; i++) {
            data[i] = i;
        }
        return data;
    }

    public static Integer[] generatorRandomArray(int size, int bound) {
        Integer[] data = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(bound);
        }
        return data;
    }

}
