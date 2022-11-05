package com.scaler.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setAge(24)
                .setName("Naman")
                .setBatch("ABC")
                .setGradYear(2023)
                .build();

//        Student s1 = new Student(null);
    }
}
