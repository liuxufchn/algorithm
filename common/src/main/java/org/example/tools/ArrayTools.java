package org.example.tools;

public class ArrayTools {
    private ArrayTools() {
    }

    public static <T> void swap(T[] data, int i, int j) {
        T tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] data) {
        if (data == null)
            throw new RuntimeException("Array is empty");
        if (data.length == 0)
            return true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i].compareTo(data[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}
