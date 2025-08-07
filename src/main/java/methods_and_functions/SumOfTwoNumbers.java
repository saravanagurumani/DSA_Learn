//Write a program to print the sum of two numbers entered by user by defining your own method.

package methods_and_functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void sumnumbers(int a,int b){
        int sum=0;
        sum=a+b;
        System.out.println(a + " + " + b + " = " + sum );
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1= scan.nextInt();
        System.out.println("Enter second Number : ");
        int num2= scan.nextInt();
        sumnumbers(num1,num2);

    }
}
