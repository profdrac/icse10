package board;

import java.util.Scanner;

/*
Question 7:
Write a program to accept a word and convert it into lowercase if it is in uppercase, and 
display the new word by replacing only the vowels with the character following it :

Example :
Sample Input : computer
Sample Output : cpmpvtfr
*/

public class icse2011q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.print((char) (ch+1));
            else
            System.out.print(ch);
        }
        sc.close();
    }    
}
