//Write a Program to find the Maximum and Minimum of the Given Three Numbers.

package methods_and_functions;

import java.util.Scanner;

public class MaxAndMinOfThreeNo {
    public static int max(int a,int b,int c){
        if (a<b) {
            if(b<c){
                return c;
            }
            return b;
        }else if (a<c){
            return c;
        }
        return a;
    }
    public static int min(int a, int b, int c){
        if(a<b){
            if(a<c){
                return a;
            }
            return c;
        } else if (b<c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=scan.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2=scan.nextInt();
        System.out.println("Enter 3rd number : ");
        int num3=scan.nextInt();
        System.out.println("The Maximum Number is : " + max(num1,num2,num3));
        System.out.println("The Minimum number is : " + min(num1,num2,num3));
    }
}
