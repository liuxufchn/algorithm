package org.example.tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SortTools {

    public static final Integer N = 100000;

    private SortTools() {
    }

    public static <T> void testSort(Class<?> clz, T[] data) {
        Method method = (Method) Arrays.stream(clz.getMethods()).filter(m -> m.getName().endsWith("Sort")).toArray()[0];

        try {
            long startTime = System.nanoTime();
            method.invoke(clz, new Object[]{data});
            long endTime = System.nanoTime();
            double durTime = (endTime - startTime) / 1.0E9;
            System.out.println("durTime = " + durTime);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
