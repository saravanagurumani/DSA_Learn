//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class InputSumofAll {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter the number: ");
            int num=scan.nextInt();
            if (num != 0) {
                sum+=num;
            } else if (num==0) {
                System.out.println("The sum all number you entered is : " + sum);
                break;
            }
        }
    }
}
