
package Lec4_Exercise;
import java.util.Scanner;
public class QuadraticEquationSolver {
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Input: ");
        int age=keyboard.nextInt();
        System.out.print("Output: ");
        if(age>=60){
            System.out.println("Senior");
        }else if(age>=20){
            System.out.println("Adult");
        }else if(age>=13){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
            
    }
}
