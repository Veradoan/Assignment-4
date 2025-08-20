package Lec4_Exercise;

import java.util.Scanner;

public class QuadrantDetermination {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the coordinates(x,y): ");
        double x = keyboard.nextDouble();
        double y = keyboard.nextDouble();
        System.out.println("Input: x = "+x+","+"y = "+y);
        System.out.print("Output: ");
        if (x > 0 && y > 0) {
            System.out.print("The point is in the 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.print("The point is in the 2nd quadrant ");
        } else if (x < 0 && y < 0) {
            System.out.print("The point is in 3 quadrant");
        } else if (x > 0 && y < 0) {
            System.out.print("The point is in 4 quadrant");
        } else {
            System.out.print("The point is on an axis.");
        }

    }
}
