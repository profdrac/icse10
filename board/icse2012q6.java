package board;

import java.util.Scanner;

/*
Question 6:
Write a program to accept a string. Convert the string to uppercase.
Count and output the number of double letter sequences that exist in the string.

Sample Input: “SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE”
Sample Output: 4
*/

public class icse2012q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l-1; i++) {
            if(s.charAt(i) == s.charAt(i+1))
            count++;
        }
        System.out.println("There are " + count + " double letter sequences in the string");
        sc.close();
    }    
}
