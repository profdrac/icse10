/*
 *Question 8.

Write a program to input a sentence and convert it into uppercase and count and display the total number of words starting with a letter ‘A’.

Example:
Sample Input: ADVANCEMENT AND APPLICATION OF INFORMATION TECHNOLOGY ARE EVER CHANGING.
Sample Output : Total number of words starting with letter A = 4.

 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2019q8 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s = sc.nextLine();
		s = s.toUpperCase();
		s = " " + s;
		int l = s.length();
		int count = 0;
		for(int i=0; i<l; i++)
		{
			char ch = s.charAt(i);
			if(ch == ' ' && s.charAt(i+1)=='A')
				count++;
		}
		System.out.println("Total number of words starting with letter A = "+count);
		sc.close();
	}
}
