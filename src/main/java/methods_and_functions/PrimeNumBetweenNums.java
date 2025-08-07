package methods_and_functions;

import java.util.Scanner;

public class PrimeNumBetweenNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int a= scan.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int b=scan.nextInt();
        isprime(a,b);
    }

    private static void isprime(int x, int y) {
        for (int i = x; i < y ; i++) {
            for (int j = 2; j < y; j++) {
                if (i%j == 0) {
                    if (i == j) {
                        System.out.print(" " + i);
                    }
                    break;
                }
                System.out.print(" " + i);
                break;
            }
        }
    }
}
