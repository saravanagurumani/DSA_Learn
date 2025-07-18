package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class LcmOfTwoNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=scan.nextInt();
        System.out.println("Enter the second number:");
        int num2=scan.nextInt();
        int min,lcm,hcf=1;
        //HCf
        min=Math.min(num1,num2);
        for (int i = 1; i <= min; i++) {
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        lcm=(num1*num2)/hcf;
        System.out.println("The LCM of Two number is: " + lcm);
    }
}
