// HCF or GCD (Highest Common Factor or Greatest Common Divisor) is the largest number that divides two or more numbers without leaving a remainder.
package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class HcfOrGcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();
        //Using Euclidean Algorithm
//        while(num2!=0){
//            int temp = num2;
//            num2=num1%num2;
//            num1=temp;
//        }
//        System.out.println("The HCF or GCD of the two numbers is: " + num1);

        //using Brute Force Method
        int min=Math.min(num1, num2);
        int hcf = 0;
        for (int i = 1; i <= min; i++) {
            if(num1 % i==0 && num2 % i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF or GCD of the tow numbers is : " + hcf);
    }
}
