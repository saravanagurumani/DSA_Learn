//Define a program to find out whether a given number is even or odd.

package methods_and_functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void evenorodd(int num){
        if(num%2==0){
            System.out.println(num + " This number is Even!");
        }else
            System.out.println(num + " This number is Odd");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= scan.nextInt();
        evenorodd(n);
    }
}
