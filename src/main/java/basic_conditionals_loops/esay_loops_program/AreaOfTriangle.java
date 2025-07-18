//Area of triangle

//formula for this area=(1/2)*base*height

package basic_conditionals_loops.esay_loops_program;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Base of triangle : ");
        int b=scan.nextInt();
        System.out.println("Enter the Height of triangle : ");
        int h=scan.nextInt();
        double area=0.5*b*h;   //1 and 2 are both integers, so 1 / 2 performs integer division, which ignores the decimal part → result is 0.
        System.out.println("The area of the Triangle is : " + area);
    }
}

