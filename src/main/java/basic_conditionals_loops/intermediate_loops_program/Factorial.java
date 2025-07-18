package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=scan.nextInt();
        double fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact*=i;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }
}



