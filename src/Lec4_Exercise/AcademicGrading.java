package Lec4_Exercise;

import java.util.Scanner;

public class AcademicGrading {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input: ");
        double grade = keyboard.nextDouble();
        System.out.print("Output: ");
        if (grade < 0 || grade > 10) {
            System.out.print("Invalid");
        } else {
            if (grade >= 9) {
                System.out.println("Excellent");
            } else if (grade >= 8) {
                System.out.println("Good");
            } else if (grade >= 6.5) {
                System.out.println("Fair");
            } else if (grade > 5.0) {
                System.out.println("Average");

            } else {
                System.out.println("Fail");

            }
        }
    }
}
