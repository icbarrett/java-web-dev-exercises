package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        return ("The course for " + topic + " taught by " + instructor + " contains the following students erolled" +
                enrolledStudents);

    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Course name){
        if(name == this) {
            return true;
        }
        if (name == null) {
            return false;
        }
        if(name.getClass() != getClass()){
            return false;
        }
        Course course = (Course) name;
        return course.instructor == instructor && course.topic == topic;
    }
}
