package com.edstats.domain;


public class Grade {

    
    private Student student;

    
    private String value;

    // Constructors
    public Grade() {

    }
    public Grade(Student student, String value) {
        this.student = student;
        this.value = value;
    }

    // Getters and Setters 
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student; 
    }

    public String getValue() {
        return value; 
    }

    public void setValue(String value) {
        this.value = value; 
    }
}