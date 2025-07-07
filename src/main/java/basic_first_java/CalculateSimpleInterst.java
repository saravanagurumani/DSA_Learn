package basic_first_java;

import java.util.Scanner;

public class CalculateSimpleInterst {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Princple Ammount : ");
        double p=scan.nextDouble();
        System.out.println("Enter the Years : ");
        double y=scan.nextDouble();
        System.out.println("Enter the Rate of Interest (R) per annum:");
        double r=scan.nextDouble();
        double simpleinterst=(p*y*r)/100;
        System.out.println("Simple Interest = " + simpleinterst);
    }
}
