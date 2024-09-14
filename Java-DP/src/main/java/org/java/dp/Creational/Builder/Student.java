package org.java.dp.Creational.Builder;

import java.util.List;

public class Student {
    private String name;
    private String rollNo;
    private String age;
    private String fatherName;
    private String motherName;
    private List<String> subjects;

    public Student(StudentBuilder student) {
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.age = student.age;
        this.fatherName = student.fatherName;
        this.motherName = student.motherName;
        this.subjects = student.subjects;
    }

    @Override
    public String toString() {
        return "Student Name: " + name +
                "\nStudent RollNo: " + rollNo +
                "\nStudent Age: " + age +
                "\nStudent Father Name: " + fatherName +
                "\nStudent Mother Name: " + motherName +
                "\nStudent Subjects: " + subjects + "\n";
    }
}

