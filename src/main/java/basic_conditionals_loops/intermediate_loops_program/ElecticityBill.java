// calculate the electricity bill based on the units consumed

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class ElecticityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units = scan.nextInt();
        double billAmount = 0;
        if(units<=0){
            System.out.println("Invalid input. Please enter a positive number of units.");
       }else if (units<=100){
            billAmount=units*1.5;
        } else if (units<=200) {
            billAmount=(100*1.5) + (units-100) * 2.0;
        } else if (units<=300) {
            billAmount=(100*1.5) + (100*2.0) + (units-200) * 3.0;
        }
        else {
            billAmount=(100*1.5) + (100*2.0) + (100*3.0) + (units-300) * 5.0;
        }
        System.out.println("Your electricity bill is: " + billAmount);
    }
}