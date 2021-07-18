/*
 *Question 8.

Write a menu driven program to display the pattern as per user’s choice.

ABCDE
ABCD
ABC
AB
A

B
LL
UUU
EEEE

For an incorrect option, an appropriate error message should be displayed.

 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2018q8 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] Print ABCDE triangle");
		System.out.println("[2] Print BLUE triangle");
		System.out.print("Your choice? ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				String s = "ABCDE";
				for(int i = 4; i>=0; i--)
				{
					for(int j = 0; j<=i; j++)
					{
						System.out.print(s.charAt(j));
					}
					System.out.println();
				}
				break;
			case 2:
				s = "BLUE";
				for(int i=0; i<s.length(); i++)
				{
					for(int j=0; j<=i; j++)
						System.out.print(s.charAt(i));
					System.out.println();
				}
				break;
			default:
				System.out.println("Invalid choice");
		}	
		sc.close();
	}
}
