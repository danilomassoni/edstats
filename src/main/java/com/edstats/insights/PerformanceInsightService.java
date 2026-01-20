package com.edstats.insights;

public class PerformanceInsightService {

    private final ClassStatistics statistics;

    public PerformanceInsightService(ClassStatistics statistics){
        this.statistics = statistics;
    }
    
    public List<Student> studentBelowAverage(ClassGroup classGroup) {
        double average = statistics.average(classGroup);
        return classGroup.getStudents()
                .stream()
                .filter(g -> g.getValues() < average)
                .map(Grade::getStudent)
                .toList();
    }
}
