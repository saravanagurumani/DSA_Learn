package methods_and_functions;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n= scan.nextInt();
        naturalnum(n);
    }

    private static void naturalnum(int n) {
        int sum=0;
        for (int i = 1; i <= n ; i++) {
            sum+=i;
        }
        System.out.println(n + " The Sum of First Natural Number is : " + sum);
    }
}
