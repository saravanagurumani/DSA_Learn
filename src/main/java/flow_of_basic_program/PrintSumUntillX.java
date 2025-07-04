//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

package flow_of_basic_program;

import java.util.Scanner;

public class PrintSumUntillX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter a number (or 'x' to stop): ");
            String word= scan.next();
            if(word.equalsIgnoreCase("x")){
                break;
            }
            try {
                int num=Integer.parseInt(word);
                sum+=num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to stop.");
            }

        }
        System.out.println("The sum of all numbers is: " + sum);
    }
}
