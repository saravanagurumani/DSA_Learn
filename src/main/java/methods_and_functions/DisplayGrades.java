/*Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */

package methods_and_functions;

import javax.swing.*;
import java.util.Scanner;

public class DisplayGrades {
    public static void grades(int n){
        if (n>91 && n<100) {
            System.out.println("Your Grade is : AA");
        } else if (n>81 && n<90) {
            System.out.println("Your Grade is : AB");
        }
        else if (n>71 && n<80) {
            System.out.println("Your Grade is : BB");
        }
        else if (n>61 && n<70) {
            System.out.println("Your Grade is : BC");
        }
        else if (n>51 && n<60) {
            System.out.println("Your Grade is : CD");
        }
        else if (n>41 && n<50) {
            System.out.println("Your Grade is : DD");
        }
        else if(n<=40){
            System.out.println("Unfortunately, You are Fail");
        }
        else
            System.out.println("Your ");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Mark (out of 100) : ");
        int num= scan.nextInt();
        grades(num);
    }
}
