package com.edstats.statistics;

public class DeviationCalculator {

    private final ClassStatistics statistics;

    public DeviationCalculator(ClassStatistics statistics){
        this.statistics = statistics;
    }

    // Simple Deviation
    public double calculateSimpleDeviation(double value, ClassGroup classGroup) {
        return value - statistics.average(classGroup);
    }

    // Standard Deviation
    public static double calculateStandardDeviation(classGroup classGroup){
        double average = statistics.average(classGroup);

        double variance = classGroup.getGrades()
                .stream()
                .mapToDouble(g -> Math.pow(g.getValue() - average, 2))
                .average() 
                .orElse(0.0);
        return Math.sqrt(variance);
    }
    
    
}
