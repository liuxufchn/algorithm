package org.example.test.linearsearch;

import org.example.entity.Student;
import org.example.selectsort.SelectSort;
import org.example.tools.ArrayGenerator;
import org.example.tools.ArrayTools;
import org.example.tools.SortTools;

import java.util.Arrays;

public class SelectSortTest {
    public static void main(String[] args) {

//        Student[] students = {new Student("Alice", 66), new Student("Bob", 100), new Student("Charles", 93)};
//        SelectSort.selectSort(students);
//        System.out.println(Arrays.toString(students));
//
        Integer[] data = ArrayGenerator.generatorRandomArray(SortTools.N, SortTools.N);

        SortTools.testSort(SelectSort.class, data);
    }
}
