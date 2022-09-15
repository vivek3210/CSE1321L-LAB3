/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 3C
*/
import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        float quarterValue = .25F;
        float dimesValue = .10F;
        float nicklesValue = .05F;
        float penniesValue = .01F;
        int dollarNumber;
        float centsNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        quarters = input.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = input.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickles = input.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = input.nextInt();

        System.out.print("\n");

        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickles + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");

        System.out.print("\n");
        dollarNumber = (int) ((quarters * quarterValue) + (dimes * dimesValue) + (nickles * nicklesValue) + (pennies * penniesValue));
        System.out.print("Your total is " + dollarNumber + " dollars and ");
        System.out.printf("%.0f", ((quarters * quarterValue) + (dimes * dimesValue) + (nickles * nicklesValue) + (pennies * penniesValue) - dollarNumber) * 100);
        System.out.print(" cents.");



    }
}
