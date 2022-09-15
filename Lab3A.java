/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 3A
*/
import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args){
        float amountOwed;
        float apr;
        float monthlyPercentageRate;
        float minimumPayment;
        float calculationAPR;

        Scanner input = new Scanner(System.in);

        System.out.print("Amount owed: $");
        amountOwed = input.nextFloat();

        System.out.print("APR: ");
        apr = input.nextFloat();

        calculationAPR = apr / 100;
        monthlyPercentageRate = apr / 12;
        minimumPayment = amountOwed * calculationAPR / 12;

        System.out.printf("Monthly percentage rate: %.3f", monthlyPercentageRate);
        System.out.print("\n");
        System.out.printf("Minimum payment: $%.2f", minimumPayment);


    }
}
