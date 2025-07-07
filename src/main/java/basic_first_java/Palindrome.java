//To find out whether the given String is Palindrome or not.

package basic_first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Words: ");
        String word=scan.next();
        String up=word.toLowerCase();
        String rev = "";
        for (int i = up.length()-1; i >= 0; i--) {
            rev+=up.charAt(i);
        }
        if (rev.equals(up)){
            System.out.println(word + " This is Polindrome ");
        }else {
            System.out.println(word + " This is Not a Ploindrome");
        }
    }
}
