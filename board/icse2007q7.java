package board;

import java.util.Scanner;

/*
Question 7:
Write a program to enter a sentence from the keyboard and count the number of times a particular word occurs in it. Display the frequency of the search word.
Example:
INPUT:
Enter a sentence : the quick brown fox jumps over the lazy dog.
Enter a word to be searched : the
OUTPUT :
Searched word occurs : 2 times
*/
public class icse2007q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        System.out.print("Enter a word to be searched: ");
        String sw = sc.nextLine();
        s += ' ';
        int l = s.length();
        int p = 0;
        int count = 0;
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                String w = s.substring(p, i);
                if(w.equalsIgnoreCase(sw) == true)
                count++;
                p = i+1;
            }
        }
        System.out.println("Searched word occurs "+count+" times");
        sc.close();
    }
}
