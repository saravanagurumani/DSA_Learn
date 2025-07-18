//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class EvenDaysGivenMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month : ");
        String m=scan.nextLine();
        String month=m.toLowerCase();
        int dayofthemonth = 0,count=0;;
        switch (month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                dayofthemonth=31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                dayofthemonth=30;
                break;
            case "february":
                dayofthemonth = 28; // or 29 for leap year
                break;
            default:
                System.out.println("Invalid month name.");
        }
        for (int i = 1; i <=dayofthemonth ; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Kunal is allowed to go out with his friends only on the " + count + " days");
    }
}
