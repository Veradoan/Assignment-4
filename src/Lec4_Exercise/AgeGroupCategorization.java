package Lec4_Exercise;

import java.util.Scanner;

public class AgeGroupCategorization {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the three coefficients a,b and c: ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        System.out.println("Input: a = "+a+","+"b = "+b+", c ="+c);
        if (a == 0) {
            System.out.print("This is a linear equation. The equation has one root: x = "+ -c/b);
        }else{
            double denta=b*b-4*a*c;
            if(denta>0){
                double x1=(-b+Math.sqrt(denta))/(2*a);
                double x2=(-b-Math.sqrt(denta))/(2*a);
               
                System.out.println("The equation has two distinct roots:x1 =  "+x1+" and x2 = "+x2);
            }else if(denta==0){
                double x=-b/(2*a);
                System.out.println("The equation has a double root: x1 = x2 = "+x);
            }else{
                System.out.println("The equation has no real roots.");
            }
        }
    }
}
