package org.example.linearsearch;

import org.example.entity.Student;

public class LinearSearch {

    private LinearSearch() {
    }

    public static <T> int search(T[] data, T target) {
        for (int i = 0; i < data.length; ++i) {
            if (target.equals(data[i])) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int result = LinearSearch.search(data, 16);
        System.out.println("result = " + result);

        Student[] students = {new Student("Alice"), new Student("Bob"), new Student("Charles")};
        Student bob = new Student("bob");
        int index = LinearSearch.search(students, bob);
        System.out.println("index = " + index);
    }
}
