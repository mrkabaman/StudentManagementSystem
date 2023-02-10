package org.studentmanagement;
import java.util.Scanner;

public class StudentManagement
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of new students to enroll: ");

        int numOfStudents = in.nextInt();
        in.nextLine();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {

            System.out.print("Enter student first name: ");
            String firstName = in.nextLine();

            System.out.print("Enter student last name: ");
            String lastName = in.nextLine();

            System.out.println("\n");

            students[i] = new Student(firstName,lastName);

        }
    }
}
