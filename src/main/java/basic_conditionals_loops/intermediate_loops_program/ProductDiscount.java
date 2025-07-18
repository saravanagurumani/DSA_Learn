// calculate product discount based on the price of the product

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the product:");
        double price = scan.nextDouble();
        System.out.println("Enter the Discount percentage:");
        double discountPercentage = scan.nextDouble();
        double discountAmount = 0,finalPrice = 0;
        discountAmount=(price*discountPercentage)/100;
        finalPrice= price - discountAmount;
        System.out.println("The Final price after discount is: " + finalPrice);
    }
}
