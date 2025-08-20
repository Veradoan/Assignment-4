
package Lec4_Exercise;
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Input: ");
        int year=keyboard.nextInt();
        System.out.print("Output :");
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(year+ " is a leap year");
        }else{
            System.out.println(year +" is not a leap year");
        }
        
    }
}
