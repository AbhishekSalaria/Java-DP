package org.java.dp.Creational.Builder;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNo("2").setName("Salaria").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNo("1").setName("Abhishek").setSubjects().setAge("27").build();
    }
}
