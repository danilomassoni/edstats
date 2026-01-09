package com.edstats;

import com.edstats.domain.ClassGroup;
import com.edstats.domain.Grade;
import com.edstats.domain.Student;
import com.edstats.service.ClassStatisticsService;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(1L, "Ana");
        Student s2 = new Student(2L, "Bruno");
        Student s3 = new Student(3L, "Danilo");

        ClassGroup turma = new ClassGroup("3º ano EM A");

        turma.addGrade(new Grade(s1, 8.5));
        turma.addGrade(new Grade(s2, 7.0));
        turma.addGrade(new Grade(s3, 9.0));

        ClassStatisticsService stats = new ClassStatisticsService();

        System.out.println("Média: " + stats.average(turma));
        System.out.println("Maior nota: " + stats.max(turma));      
        System.out.println("Menor nota: " + stats.min(turma));
        System.out.println("Mediana: " + stats.median(turma));
    }
    
}
