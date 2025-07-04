//Take two numbers and print the sum of both.

package flow_of_basic_program;

import java.util.Scanner;

public class SumOfTowNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1=scan.nextInt();
        System.out.println("Enter Second Number : ");
        int num2=scan.nextInt();
        int ans=num1+num2;
        System.out.println("The Answer is : " + num1 + " + " + num2 + " = " + ans);
    }
}
