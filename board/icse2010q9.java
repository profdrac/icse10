package board;

import java.util.Scanner;

/*
Question 9:
Write a program to input a string in uppercase and print the frequency of each character.
*/

public class icse2010q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toUpperCase();
        int l = s.length();
        int count = 0;
        for (int i = 65; i <= 90; i++) {
            count = 0;
            for (int j = 0; j < l; j++) {
                int ac = (int) s.charAt(j);
                if(ac == i)
                count++;
            }
            if(count != 0)
            System.out.println((char) i + "\t" + count);
            count = 0;
        }
        sc.close();
    }
}
