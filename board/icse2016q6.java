/*
Question 6:

Special words are those words which starts and ends with the same letter.

Examples:
EXISTENCE
COMIC
WINDOW

Palindrome words are those words which read the same from left to right and vice versa

Examples:
MALAYALAM
MADAM
LEVEL
ROTATOR
CIVIC

All palindromes are special words, but all special words are not palindromes. Write a program to accept a word check and print Whether the word is a palindrome or only special word.
@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2016q6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = sc.next();
		s = s.toUpperCase();
		int l = s.length();
		if(s.charAt(0) == s.charAt(l-1))
		{
			String rev = "";
			for(int i=0; i<l; i++)
				rev = s.charAt(i) + rev;
			if(s.equals(rev))
				System.out.println("Palinddrome word");
			else
				System.out.println("Only special word");
		}
		else
			System.out.println("Neither special nor palindrome");
		sc.close();
	}
}
