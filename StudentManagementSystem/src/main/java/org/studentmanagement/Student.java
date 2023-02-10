package org.studentmanagement;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    //static variable: not specific to an object but is true for all objects
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void setCourse(String course) {
        this.courses = this.courses + "\n " + course;
    }

    public int getCostOfCourse()
    {
        return this.costOfCourse;
    }
    public void setTuitionBalance(int value) {
        this.tuitionBalance = value;
    }

    public int getTuitionBalance()
    {
        return this.tuitionBalance;
    }

    public String toString(){
        return "Name: " + firstName + "" + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
