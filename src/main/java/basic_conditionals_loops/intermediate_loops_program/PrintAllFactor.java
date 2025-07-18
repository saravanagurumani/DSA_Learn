//Input a number and print all the factors of that number (use loops).

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class PrintAllFactor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println("The Factor is : " + i);
            }
        }
    }
}
