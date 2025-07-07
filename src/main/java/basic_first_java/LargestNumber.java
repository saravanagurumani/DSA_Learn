//Take 2 numbers as input and print the largest number.

package basic_first_java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int num1=scan.nextInt();
        System.out.println("Enter the 2nd Number:");
        int num2=scan.nextInt();
        if(num1<num2){
            System.out.println(num2 + " is the largest number");
        }else {
            System.out.println(num1 + " is largest number");
        }
    }
}
