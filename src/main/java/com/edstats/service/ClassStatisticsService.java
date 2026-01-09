package com.edstats.service;

import java.util.List;

import com.edstats.domain.ClassGroup;
import com.edstats.domain.Grade;



public class ClassStatisticsService {

    //Average
    public double average(ClassGroup classGroup) {
        return classGroup.getGrades()
                .stream()
                .mapToDouble(Grade::getValue)
                .average()
                .orElse(0.0);
    }

    // High Score
    public double max(ClassGroup classGroup) {
        return classGroup.getGrades()
                .stream()
                .mapToDouble(Grade::getValue)
                .max()
                .orElse(0.0);
    }

    // Low Score
    public double min(ClassGroup classGroup) {
        return classGroup.getGrades()
                .stream()
                .mapToDouble(Grade::getValue)
                .min()
                .orElse(0.0);
    }

    // Median
    public double median(ClassGroup classGroup) {
        List<Double> sortedGrades = classGroup.getGrades()
                .stream()
                .map(Grade::getValue)
                .sorted()
                .toList();

        int size = sortedGrades.size();

        if (size == 0) return 0.0;

        if (size % 2 == 1) {
            return sortedGrades.get(size / 2);
        } else {
            return (sortedGrades.get(size / 2 - 1) + sortedGrades.get(size / 2)) / 2;
        }
    }
}
