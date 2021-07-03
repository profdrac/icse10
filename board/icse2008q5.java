package board;

import java.util.Scanner;

/*
Question 5:
Write a program to input a string and print out the text with the uppercase and lowercase letters reversed,
but all other characters should remain the same as before.
Example:
INPUT : WelComE TO School
OUTPUT : wELcOMe to sCHOOL
*/

public class icse2008q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        int l = s.length();
        for(int i = 0; i < l; i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
            System.out.print(Character.toLowerCase(ch));
            else
            System.out.print(Character.toUpperCase(ch));
        }
        sc.close();
    }
}
