package cse213.studentsp;

import javafx.scene.control.Alert;

import java.time.LocalDate;

public class Student {
    private String name ;
    private int id;
    private float cgpa;
    private LocalDate dateOfBirth;
    private boolean hasScholarship;

    public Student(String name, int id, float cgpa, LocalDate dateOfBirth, boolean hasScholarship) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.dateOfBirth = dateOfBirth;
        this.hasScholarship = hasScholarship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
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
