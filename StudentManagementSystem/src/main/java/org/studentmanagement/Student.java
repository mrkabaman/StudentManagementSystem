package org.studentmanagement;

/**
 * Created by Arlef Kaba, Jr. on 10/02/2023.
 */
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
}
