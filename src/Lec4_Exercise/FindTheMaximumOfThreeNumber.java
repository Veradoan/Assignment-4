package Lec4_Exercise;

import java.util.Scanner;

public class FindTheMaximumOfThreeNumber {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        System.out.println(a + "," + b + "," + c);
        /*int max;
        if (a >= b) {
            if (a >= c) {
                max = a;
                System.out.println("The largest number is " + a);
            } else {
                max = c;
                System.out.println("The largest number is " + c);
            }
        } else {
            if (b >= c) {
                max = b;
                System.out.println("The largest number is " + b);
            } else {
                max = c;
                System.out.println("The largest number is " + c);
            }
        }*/
        if (a >= b && a >= c) {
            System.out.println("The largest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is " + b);
        } else {
            System.out.println("The largest number is " + c);
        }
    }
}
