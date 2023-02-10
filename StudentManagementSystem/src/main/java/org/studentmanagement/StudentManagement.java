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

            //Create the basic studentBeingProcess
            Student studentBeingProcess = new Student(firstName,lastName);

            System.out.print("Enter student class level:\n1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior\n");
            int gradeYear = in.nextInt();
            studentBeingProcess.setGradeYear(gradeYear);
            studentBeingProcess.setStudentID();

            enroll(studentBeingProcess);
            payTuition(studentBeingProcess);
            viewBalance(studentBeingProcess);

            students[i] = studentBeingProcess;

            in.nextLine();

        }


    }

    public static void enroll(Student student)
    {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                student.setCourse(course);
                int newTuitionBalance = student.getTuitionBalance() + student.getCostOfCourse();
                student.setTuitionBalance(newTuitionBalance);
            } else {
                break;
            }
        } while (1 != 0);
    }

    public static void viewBalance(Student student)
    {
        System.out.println("Your balance is: $" + student.getTuitionBalance());
    }

    public static void payTuition(Student student)
    {
        viewBalance(student);

        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        int newTuitionBalance = (student.getTuitionBalance()) - payment;
        student.setTuitionBalance(newTuitionBalance);
        System.out.println("Thank you for your payment of $" + payment);


        viewBalance(student);
    }

}
