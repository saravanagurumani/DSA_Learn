// Area of Circle

//formula for this is : area=PI*r*r

package basic_conditionals_loops.esay_loops_program;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        int r=scan.nextInt();
        final double PI=Math.PI;
        double area= PI*r*r;
        System.out.println("The area of Circle is : " + area);
    }
}
