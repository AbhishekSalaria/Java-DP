package org.java.dp.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("DSA");
        subjects.add("Java Programming");
        subjects.add("Software Engineering");
        this.subjects = subjects;
        return this;
    }
}
