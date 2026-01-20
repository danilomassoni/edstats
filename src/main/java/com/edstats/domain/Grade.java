package com.edstats.domain;


public class Grade {

    
    private final Student student;

    private final double value;

    // Constructors
    
    public Grade(Student student, double value) {
        this.student = student;
        this.value = value;
    }

    // Getters and Setters 
    public Student getStudent() {
        return student;
    }


    public double getValue() {
        return value; 
    }


}