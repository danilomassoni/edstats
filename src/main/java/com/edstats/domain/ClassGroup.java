package com.edstats.domain;

import java.util.ArrayList;
import java.util.List;

public class ClassGroup {
    
    private String name;
    private List<Grade> grades = new ArrayList<>();


    public ClassGroup(String name){
        this.name = name;
    }

    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
