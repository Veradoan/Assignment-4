package Lec4_Exercise;

import java.util.Scanner;

public class EvenOrOddChecker {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input: ");
        int num = keyboard.nextInt();
       System.out.print("Output: ");
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
