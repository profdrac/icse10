package board;

import java.util.Scanner;

/*
Write a program using a method Palin(), to check whether a string is a Palindrome or not. A Palindrome is a string that reads the same from left to right and vice versa.
E.g. MADAM, ARORA, ABBA, etc.
*/
public class icse2007q9 {
    private void Palin(String s)
    {
        int l = s.length();
        String rev = "";
        for (int i = 0; i < l; i++)
            rev = s.charAt(i) + rev;
        if(s.compareTo(rev) == 0)
        System.out.println("Palindrome word");
        else
        System.out.println("Not a Palindrome word");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        icse2007q9 o = new icse2007q9();
        System.out.print("Enter a word: ");
        String s = sc.next();
        s = s.toLowerCase();
        o.Palin(s);
        sc.close();
    }
}