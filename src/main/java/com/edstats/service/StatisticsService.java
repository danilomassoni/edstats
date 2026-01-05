package com.edstats.service;

import java.util.List;

import com.edstats.domain.Grade;
import com.edstats.domain.Student;


public class StatisticsService {

    private final Grade value;
    private final Student student;

    public double calculateAverageGrade(List<Grade> grades) {
        return grades.stream()
                .mapToDouble(grade::getValue)
                .average()
                .orElse(0.0);
    }

    public double findMaxGrade(List<Grade> grades) {
        return grades.stream()
                .mapToDouble(Grade::getValue)
                .max()
                .orElse(0.0);
    }

    public double findMinGrade(List<Grade> grades) {
        return grades.stream()
                .mapToDouble(Grade::getValue)
                .min()
                .orElse(0.0);
    }
}