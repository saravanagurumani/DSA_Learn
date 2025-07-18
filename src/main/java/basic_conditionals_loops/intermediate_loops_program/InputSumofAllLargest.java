//Take integer inputs till the user enters 0 and print the largest number from all.

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class InputSumofAllLargest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=0;
        while(true){
            System.out.println("Enter the number: ");
            int num=scan.nextInt();
            if (num == 0) {
                break;
            } else if (max<num) {
               max =num;
            }
        }
        System.out.println("The Largest number you Entered is : " + max);
    }
}
