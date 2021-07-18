/*
 *Question 6.

Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string.

Sample input: we are in cyber world
Sample output : We Are In Cyber World

 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2018q6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		s = " " + s;
		int l = s.length();
		String snew = "";
		for(int i=0; i<l; i++)
		{
			if(s.charAt(i) == ' ')
			{
				snew += " " + Character.toUpperCase(s.charAt(i+1));
				i++;
			}
			else
				snew += s.charAt(i);
		}
		System.out.println(snew.trim());
		sc.close();
	}
}
