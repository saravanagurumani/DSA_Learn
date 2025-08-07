//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

package methods_and_functions;

import java.util.Scanner;

public class EligibleForVote {
    public static void vote(int n){
        if(n<18){
            System.out.println("Your Not Eligible to Vote!");
        }else
            System.out.println("Congratulations, You are Eligible to vote!");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age= scan.nextInt();
        vote(age);
    }
}
