package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int numberOfCredits) {

        if (numberOfCredits < 30) {
            return "freshman";
        } else if (numberOfCredits <=59) {
            return "Sophmore";
        } else if (numberOfCredits <=89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {

        Double totalScore = this.gpa * this.numberOfCredits;
        // gpa = (total quality score) / (total number of credits)

        //To update the student’s GPA:
        //
        //Calculate their current total quality score by using the formula gpa * numberOfCredits.
        totalScore += courseCredits * grade;

        //Use the new course grade and course credits to update their total quality score.
        this.numberOfCredits += courseCredits;

        //Update the student’s total numberOfCredits.
        //Compute their new GPA.
        this.gpa = totalScore/numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
public String toString(){
        return ("Student "+ name + "; Student id: " + studentId + " ; Current GPA: " + gpa + " ; Current Credits: " + numberOfCredits);
}
    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public boolean equals(Student target) {
            if (this == target) return true;
            if (target == null || getClass() != target.getClass()) return false;
            Student theStudent = (Student) target;
//            return studentId == student.studentId;
            return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,75,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.getGradeLevel(sally.getNumberOfCredits()));
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
