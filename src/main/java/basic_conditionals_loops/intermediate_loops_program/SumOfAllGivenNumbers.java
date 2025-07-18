//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class SumOfAllGivenNumbers {
    public static void main(String[] args) {
        int negativesum=0;
        int positiveevensum=0;
        int positiveoddsum=0;
        int num;
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("enter number : ");
            num=scan.nextInt();
            if(num==0){
                break;
            }else if (num<0) {
                negativesum+=num;
            } else if (num%2==0) {
                positiveevensum+=num;
            } else {
                positiveoddsum+=num;
            }
        }
        System.out.println("Sum of Negative Numbers is : " + negativesum);
        System.out.println("Sum of Positive Even Numbers is : " + positiveevensum);
        System.out.println("Sum of Positive Odd Numbers is : " + positiveoddsum);
    }
}

