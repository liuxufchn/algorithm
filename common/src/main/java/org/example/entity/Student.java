package org.example.entity;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {
    private String name;
    private Integer score;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return other.getName().equalsIgnoreCase(this.name);
    }

    public int compareTo(Student student) {
        return this.score - student.score;
    }
}
