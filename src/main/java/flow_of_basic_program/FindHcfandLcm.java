//Take 2 numbers as inputs and find their HCF and LCM.

package flow_of_basic_program;

import java.util.Scanner;

public class FindHcfandLcm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1= scan.nextInt();
        System.out.println("Enter the number : ");
        int num2= scan.nextInt();
        int min=(num1<num2)?num1:num2;
        int hcf=1;
        for (int i = 2; i <= min ; i++) {
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        int lcm=(num1*num2)/hcf;
        System.out.println("The HCF is : " + hcf);
        System.out.println("The LCM is : " + lcm);
    }
}
