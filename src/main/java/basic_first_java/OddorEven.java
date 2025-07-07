//Write a program to print whether a number is even or odd, also take input from the user.

package basic_first_java;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number (Even or Odd) :");
        int in= scan.nextInt();
        if(in%2==0){
            System.out.println(in + " This number Even!");
        }
        else{
            System.out.println(in + " This number is Odd!");
        }
    }
}
