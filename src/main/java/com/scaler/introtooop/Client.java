package com.scaler.introtooop;

public class Client {

    public static void main(String[] args) {
        // int a = 2;
        // [DataType] [VariableName] = [InitialValue];

        Student naman = new Student();
        naman.age = 24;
        naman.name = "Naman";
        naman.batch = "Oct 22 Intermediate";

        Student manish = new Student();
        manish.age = 23;
        manish.name = "Manish";
        manish.batch = "US Feb 22";

        naman.changeBatch("March 22 Advanced");

        manish.pauseCourse(2);

    }
}
