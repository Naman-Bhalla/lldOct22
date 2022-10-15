package com.scaler.accessmodifiers;

public class Student {
    private int id; // only same class
    String name; // same package -> accessmodifiers
    protected String gender; // -> accessmodifers and child
    public int age; // -> anyone
    String batch;

    protected void changeBatch(String newBatch) {
        batch = newBatch;
        System.out.println("Batch changed");
    }

    public void pauseCourse(int duration) {
        batch = null;
        System.out.println("Course Paused");
    }
}
