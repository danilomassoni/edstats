package com.edstats.statistics;

import java.util.List;

import com.edstats.domain.ClassGroup;
import com.edstats.domain.Grade;

public class ClassStatistics {
    

    //Average
    public static double calculateAverage(ClassGroup classGroup) {
        return classGroup.getGrades()
                .stream()
                .mapToDouble(Grade::getValue)
                .average()
                .orElse(0.0);
    }

    // Median
    public static double calculateMedian(ClassGroup classGroup) {
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

    // High Score
    public static double calculateHighScore(ClassGroup classGroup) {
        return classGroup.getGrades()
                .stream()
                .mapToDouble(Grade::getValue)
                .max()
                .orElse(0.0);
    }

    // Low Score
    public static double calculateLowScore(ClassGroup classGroup) {
        return classGroup.getGrades()
                .stream()
                .mapToDouble(Grade::getValue)
                .min()
                .orElse(0.0);
    }

    


}
