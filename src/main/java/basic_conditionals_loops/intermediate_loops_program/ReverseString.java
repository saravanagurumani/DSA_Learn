//Reverse A String In Java

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scan.nextLine();
        String rev="";
        String all=input.toLowerCase();
        for(int i=all.length()-1; i>=0 ; i--){
            rev+=all.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}
