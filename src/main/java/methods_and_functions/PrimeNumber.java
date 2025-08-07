package methods_and_functions;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primenumber(int n){
        if(n==0||n==1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num= scan.nextInt();
        if(primenumber(num)){
            System.out.println(num + " This is prime number");
        }else
            System.out.println(num + " This is not a prime number ");
    }
}
