//how to calculate batting average in cricket

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Total Runs Scored:");
        int totalRuns = scan.nextInt();
        System.out.println("Enter the number of times the player was out:");
        int outs = scan.nextInt();
        double battingAverage = 0;
        if(outs==0){
            System.out.println("Batting Average cannot be calculated as the player has never been out.");
        }
        else {
            battingAverage= (double) totalRuns /outs;
            System.out.println("The Batting Average is: " + battingAverage);
        }
    }
}
