package cse213.studentsp;

import java.time.LocalDate;

public class Student {
    String name ;
    int id;
    float cgpa;
    LocalDate dateOfBirth;
    boolean hasScholarship;

    public Student(String name, int id, float cgpa, LocalDate dateOfBirth, boolean hasScholarship) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.dateOfBirth = dateOfBirth;
        this.hasScholarship = hasScholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cgpa=" + cgpa +
                ", dateOfBirth=" + dateOfBirth +
                ", hasScholarship=" + hasScholarship +
                '}';
    }
}
