package basic_first_java;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void armstrong(int num){
        int last, count = 0, dubnum, ans = 0;
        dubnum = num;
        while (dubnum != 0) {
            dubnum /= 10;
            count++;
        }
        dubnum = num;
        while (dubnum != 0) {
            last = dubnum % 10;
            ans += (int) Math.pow(last, count);
            dubnum /= 10;
        }
        if (ans == num) {
            System.out.println(num + " This is Armstrong number ");
        } else {
            System.out.println(num + " This is Not Armstrong number ");
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scan.nextInt();
        armstrong(num);
    }

}
