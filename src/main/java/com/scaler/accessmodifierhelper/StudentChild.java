package com.scaler.accessmodifierhelper;

import com.scaler.accessmodifiers.Student;

public class StudentChild extends Student {

    void doSomething() {
        // If you directly access inherited properties, you can
        // access public and protected and default (if in same
        // package as parent)
        this.gender = "Male";
        this.age = 23;

        // If you access the properties from a student object
        // then you are considered a client and not the child
        // => You can only can access public properties
        Student st = new Student();
        st.age = 24;
        st.pauseCourse(2);// ALlowed public
        // st.changeBatch("Mar22"); // Not allowed because
        // even though protected, accessing as a client
    }
}
