package com.scaler.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    private Student() {}

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private int gradYear;
        private String phoneNumber;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            if (this.gradYear > 2022) {
                throw new IllegalArgumentException("Grad Year can't be greater than 2022");
            }

            Student s = new Student();
            s.name = this.name;
            s.age = this.age;
            s.gradYear = this.gradYear;
            return s;
        }
    }

}
