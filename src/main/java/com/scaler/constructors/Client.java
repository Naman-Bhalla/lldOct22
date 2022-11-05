package com.scaler.constructors;

// Run Client.main()
// [ClassName].main()
// [ObjName].main()
public class Client {

    public static void main(String[] args) {
        Student st = new Student();

        StudentA sta = new StudentA();

        StudentA sta2 = new StudentA();

        StudentB stb = new StudentB("Naman", 24); // No default constructor because we created our own

//        StudentC stc = new StudentC(); Because there is no accessible constructor
        // no object of StudentC can be created! :(
        // Will learn more in SIngleton Design Pattern class


    }

}
