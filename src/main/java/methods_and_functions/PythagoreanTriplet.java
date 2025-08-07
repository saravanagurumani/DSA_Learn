/*
Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number)
formula is a^2 + b^2 = c^2
*/
package methods_and_functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=scan.nextInt();
        System.out.println("Enter 2nd number : ");
        int b= scan.nextInt();
        System.out.println("Enter 3rd number : ");
        int c= scan.nextInt();
        pythagorean(a,b,c);
    }

    private static void pythagorean(int a, int b, int c) {
        int max=Math.max(a,Math.max(b,c));
        int x=0,y=0,square,csquare;
        if(max==a){
            x=b;
            y=c;
        } else if (max==b) {
            x=a;
            y=c;
        }
        else {
            x=a;
            y=b;
        }
        square=(x*x)+(y*y);
        csquare=max*max;
        if (square==csquare){
            System.out.println("it's a Pythagorean");
        }else
            System.out.println("Not a Pythagorean");
    }
}
