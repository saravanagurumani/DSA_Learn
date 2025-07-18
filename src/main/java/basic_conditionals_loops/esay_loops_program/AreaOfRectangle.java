//Area of Rectangle

// the formula is Area=height*width

package basic_conditionals_loops.esay_loops_program;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Rectangle Length: ");
        int l=scan.nextInt();
        System.out.println("Enter the Rectangle Width : ");
        int w=scan.nextInt();
        int area=l*w;
        System.out.println("The area of Rectangle is : " + area);
    }
}
