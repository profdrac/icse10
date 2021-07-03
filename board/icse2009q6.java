package board;

import java.util.Scanner;

/*
Question 6:
Write a program to input a sentence and print the number of characters found in the longest word of the given sentence.
For example, if S=“India is my country” then the output should be 7.
*/

public class icse2009q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        s += " ";
        int l = s.length();
        int llw = 0, p = 0;
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                String w = s.substring(p, i);
                if(w.length()>llw)
                llw = w.length();
                p = i+1;
            }
        }
        System.out.print("Longest word is of length "+llw);
        sc.close();
    }
}
