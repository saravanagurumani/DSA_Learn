//Java Program Vowel Or Consonant

package basic_conditionals_loops.intermediate_loops_program;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the words to find Vowels : " );
        String word=scan.next();
        String w=word.toLowerCase();
        int count=0;
        for (int i = 0; i < w.length(); i++) {
            char c=w.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        if (count>0){
            System.out.println("you entered " + word + " there is " + count + " vowels are there");
        }
        else
            System.out.println("you entered " + word + " there is No vowels are there in entered words.so,this is Consonant");
    }
}
