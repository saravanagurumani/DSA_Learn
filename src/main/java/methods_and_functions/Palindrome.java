//Write a function to find if a number is a palindrome or not. Take number as parameter.

package methods_and_functions;

import java.util.Scanner;

public class Palindrome {
    public static void ispalind(int n){
        int temp=n,last,rev=0;
        while (n!=0){
            last=n%10;
            rev=(rev*10)+last;
            n/=10;
        }
        if(rev==temp){
            System.out.println(temp + " Is Palindrome");
        }else
            System.out.println(temp + " Is Not Palindrome");
    }

    public static void isstringpalindrome(String w){
        String temp="";
        for (int i = w.length()-1; i >= 0; i--) {
            temp+=w.charAt(i);
        }
        if(w.equals(temp)){
            System.out.println(w + " Is Palindrome");
        }
        else
            System.out.println(w + " Is Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num=scan.nextInt();
//        ispalind(num);
        System.out.println("Enter the Word :");
        String word= scan.next();
        isstringpalindrome(word.toLowerCase());
    }
}
