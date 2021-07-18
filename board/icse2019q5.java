/*
Question 5.
Using the switch-case statement, write a menu driven program to do the following :

(a) To generate and print Letters from A to Z and their Unicode Letters Unicode
Letters		Unicode
-------		-------
A		65
B		66

(b) Display the following pattern using iteration (looping) statement: 1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 

@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2019q5 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[a] Show letters and unocde");
		System.out.println("[b] Show number triangle");
		System.out.print("Your choice? ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'A':
				System.out.println("Letter\tUnicode");
				for(int i=65; i<=90; i++)
					System.out.println((char)i + "\t" + i);
				break;
			case 'b':
			case 'B':
				for(int i=1; i<=5; i++)
				{
					for(int j=1; j<=i; j++)
						System.out.print((j)+" ");
					System.out.println();
				}
				break;
			default:
				System.out.println("Not an option");
		}
		sc.close();
	}
}
