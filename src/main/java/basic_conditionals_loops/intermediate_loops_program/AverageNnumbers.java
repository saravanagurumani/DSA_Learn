// Average of the first N numbers

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class AverageNnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to average:");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum+= i;
        }
        int answer = sum / n;
        System.out.println("The average of the first " + n + " numbers is: " + answer);
    }
}
