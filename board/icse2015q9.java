/*
Question 9:
Using the switch statement, write a menu driven program to:

(i) To find and display all the factors of a number input by the user (including 1 and excluding number itself).

Example:
Sample Input: n=15
Sample Output: 1, 3, 5.

(ii) To find and display the factorial of a number input by the user (the factorial of a non-negative integer n, denoted by n\ is the product of all integers less than or equal to n.

Example:
Sample Input: n=5
Sample Output: 5! = 1×2×3×4×5 = 120.
For an incorrect choice, an appropriate error message should be displayed

@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2015q9 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] Print factors");
		System.out.println("[2] Show factorial");
		System.out.print("Your choice? ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.print("Enter number: ");
				int n = sc.nextInt();
				for(int i=1; i<n; i++)
				{
					if(n%i == 0)
						System.out.print(i + ", ");
				}
				break;

			case 2:
				System.out.print("Enter number: ");
				n = sc.nextInt();
				int fact = 1;
				for(int i=n; i>1; i--)
					fact *= i;
				System.out.println("Facorial is "+fact);
				break;
			default:
				System.out.println("Not an option!");
		}
		sc.close();
	}
}
