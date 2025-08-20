
package Lec4_Exercise;
import java.util.Scanner;
public class AbsoluteValueWithTernaryOperator {
    public static void main(String args[]){
        Scanner keyboard= new Scanner (System.in);
        System.out.print("Input: ");
        double num=keyboard.nextDouble();
        num=num>=0?num:-num;
        System.out.print("Output: The absolute value is "+num);
    }
}
