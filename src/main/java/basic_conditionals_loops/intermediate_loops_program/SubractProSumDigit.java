// Subtract the Product and Sum of Digits of an Integer
// product of digit is user enter the number that idiviual number "*"product of digit
//sum of digit same us but this is "+" that's the sum of digit

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class SubractProSumDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        int pod = 1,sod = 0,ans;
        while(num!=0){
            pod*=num%10;
            sod+=num%10;
            num=num/10;
        }
        ans=pod-sod;
        System.out.println("the answer is : " + ans);
    }
}
