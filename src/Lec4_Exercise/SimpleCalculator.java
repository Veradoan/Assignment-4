package Lec4_Exercise;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input: ");
        System.out.print("First number: ");
        int n1 = keyboard.nextInt();
        System.out.print("Second number: ");
        int n2 = keyboard.nextInt();
        System.out.print("Operator: ");
        String op = keyboard.next();
        int cong = n1 + n2;
        int tru = n1 - n2;
        int nhan = n1 * n2;
        double chia = 1.0 * n1 / n2;
        switch (op) {
            case "+":
                System.out.println(n1 + "+ " + n2 + " = " + cong);
                break;
            case "-":
                System.out.println(n1 + " - " + n2 + " = " + tru);
                break;
            case "*":
                System.out.println(n1 + " * " + n2 + " = " + nhan);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.print("Error");

                } else {
                    System.out.print(n1 + " / " + n2+" = "+ chia);
                }
                break;
            default: System.out.print("Not valid");
    


        }
        
    }
}
