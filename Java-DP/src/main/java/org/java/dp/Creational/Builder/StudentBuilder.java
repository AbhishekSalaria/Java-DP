package org.java.dp.Creational.Builder;

import java.util.List;

public abstract class StudentBuilder {
    public String name;
    public String rollNo;
    public String age;
    public String fatherName;
    public String motherName;
    public List<String> subjects;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
