//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package basic_first_java;

import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int a=scan.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b= scan.nextInt();
        System.out.println("Enter the operator ( + , - , * , / ) ");
        String opt= scan.next();
        switch (opt) {
            case "+" -> System.out.println(" a + b " + (a + b));
            case "-" -> System.out.println(" a - b = " + (a - b));
            case "*" -> System.out.println(" a * b = " + (a * b));
            case "/" -> {
                if (a == 0 || b == 0) {
                    System.out.println("Your Entered '0' Invalid");
                } else {
                    System.out.println(" a / b = " + (a / b));
                }
            }
            default -> System.out.println("You Entered Wrong Operator.Please Check...!");
        }
    }
}

