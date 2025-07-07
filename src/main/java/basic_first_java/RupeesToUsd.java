package basic_first_java;

import java.util.Scanner;

public class RupeesToUsd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Rupees:");
        double rs=scan.nextDouble();
        double usd=81.25,res;
        res=rs/usd;
        System.out.println(rs + " is converted as a USD vaLue for: " + res);
    }
}
