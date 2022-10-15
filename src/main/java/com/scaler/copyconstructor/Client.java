package com.scaler.copyconstructor;


public class Client {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Naman";
        st1.age = 23;
        st1.gender = "Male";

//        This is wrong
//        Student st2 = st1;
//
//
//        st1.name = "Aishwarya";

        Student st2 = new Student(st1);
        st2.name ="Aishwarya";
        st2.batch = "mar22 advanced";
    }
}
