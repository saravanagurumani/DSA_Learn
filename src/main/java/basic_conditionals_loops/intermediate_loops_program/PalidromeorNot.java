package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class PalidromeorNot {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        int input = scan.nextInt();
        int dublicate = input;
        int rev = 0,last;
        while(dublicate!=0) {
            last=dublicate%10;
            rev=rev*10+last;
            dublicate/=10;
        }
        if(input==rev){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
