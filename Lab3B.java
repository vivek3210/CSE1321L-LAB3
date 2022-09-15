/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 3B
*/
import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
        float courseOneHours;
        float courseOneGrades;
        float courseTwoHours;
        float courseTwoGrades;
        float courseThreeHours;
        float courseThreeGrades;
        float courseFourHours;
        float courseFourGrades;
        float totalHours;
        float qualityPoints;
        float semesterGPA;

        Scanner input = new Scanner(System.in);

        System.out.print("Course 1 hours: ");
        courseOneHours = input.nextFloat();
        System.out.print("Grade for course 1: ");
        courseOneGrades = input.nextFloat();

        System.out.print("Course 2 hours: ");
        courseTwoHours = input.nextFloat();
        System.out.print("Grade for course 2: ");
        courseTwoGrades = input.nextFloat();

        System.out.print("Course 3 hours: ");
        courseThreeHours = input.nextFloat();
        System.out.print("Grade for course 3: ");
        courseThreeGrades = input.nextFloat();

        System.out.print("Course 4 hours: ");
        courseFourHours = input.nextFloat();
        System.out.print("Grade for course 4: ");
        courseFourGrades = input.nextFloat();

        totalHours = courseOneHours + courseTwoHours + courseThreeHours + courseFourHours;
        qualityPoints = (courseOneGrades * courseOneHours) + (courseTwoGrades * courseTwoHours) + (courseThreeGrades *
                courseThreeHours) + (courseFourGrades * courseFourHours);
        semesterGPA = qualityPoints / totalHours;

        System.out.printf("Total hours is: %.1f", totalHours);
        System.out.print("\n");
        System.out.printf("Total quality points is: %.1f", qualityPoints);
        System.out.print("\n");
        System.out.println("Your GPA for this semester is " + semesterGPA);



    }
}
