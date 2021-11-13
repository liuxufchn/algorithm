package org.example.entity;

import lombok.Data;

@Data
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
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
}
