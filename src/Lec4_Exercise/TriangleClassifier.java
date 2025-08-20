
package Lec4_Exercise;

import java.util.Scanner;
public class TriangleClassifier {
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the lengths of three side: ");
        double a= keyboard.nextDouble();
        double b=keyboard.nextDouble();
        double c=keyboard.nextDouble();
      System.out.println("Input: "+a+","+b+","+c);
      if(a+b>c&&a+c>b&&b+c>a){
          System.out.println("Valid triangle");
          if(a==b&&a==c&&b==c){
              System.out.print("This is an equilateral triangle.");
          }else if(a==b||a==c||b==c){
              System.out.print("This is an isosceles triangle.");
          }else if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
              System.out.print("This is a scalene triangle.");
          }else{
              System.out.print("This is a normal triangle.");
          }
      }else{
          System.out.print("These sides cannot form a triangle.");
      }
    }
}
