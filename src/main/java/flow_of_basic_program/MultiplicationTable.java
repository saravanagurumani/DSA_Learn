
//Take a number as input and print the multiplication table for it.

package flow_of_basic_program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }

}
