//To calculate Fibonacci Series up to n numbers.

package basic_first_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int s=scan.nextInt();
        int a=0,b=1,c;
        for (int i = 1; i <= s; i++) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
//            System.out.print(c + " ");
        }
    }
}
