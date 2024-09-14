package org.java.dp.Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Business Administration");
        subjects.add("People Planning");
        this.subjects = subjects;
        return this;
    }
}
