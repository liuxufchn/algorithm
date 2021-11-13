package org.example.tools;

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

}
