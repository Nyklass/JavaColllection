package com.company;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a list of student
        List<Student> studentList = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        int grade1, grade2, grade3;
        String name;
        int choice;
        do {
            //Instantiate a new object student from Student class
            Student student = new Student();

            System.out.println("Enter the student name: ");
            name = input.next();
            student.setName(name);

            //prompt user value for grade 1
            System.out.println("Enter the first grade: ");
            grade1 = input.nextInt();
            student.setGrade1(grade1);

            //prompt user value for grade 2
            System.out.println("Enter the the second grade: ");
            grade2 = input.nextInt();
            student.setGrade2(grade2);

            //prompt user value for grade 3
            System.out.println(" --Please enter the the third grade: ");
            grade3 = input.nextInt();
            student.setGrade3(grade3);

            System.out.println(" Do you want to continue?  enter the number ");
            System.out.println(" 1- YES     2- NO ");
            choice = input.nextInt();
            //calculate students average
            student.setAverage(student.calculateAverage());

            //Push a new object to student list
            studentList.add(student);
        }
        while (choice != 2);

        //Get student object with the highest average score
        Student higherStudent = Collections.max(studentList, Comparator.comparing(c -> c.getAverage()));
        //Display highest score
        System.out.println("THE HIGHEST SCORE IS  :" + higherStudent.getAverage() + "\n CONGRATULATIONS : " + higherStudent.getName());
    }
}
