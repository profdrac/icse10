/*
Question 5:

Using the switch statement, write a menu driven program for the following: [15]
(i) To print the Floyd’s triangle [Given below]

1
2      3
4      5       6
7      8       9      10
11    12    13     14    15

(ii) To display the following pattern:

I
I     C
I     C      S
I     C      S     E

For an incorrect option, an appropriate error message should be displayed.

@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2016q5 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] Print Floyd\'s Triangle");
		System.out.println("[2] Print ICSE Triangle");
		System.out.print("Enter your choice: ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				for(int i=1; i<6; i++)
				{
					for(int j=1; j<=i; j++)
					{
						System.out.print(ch+" ");
						ch++;
					}
					System.out.println();
				}
				break;
			case 2:
				String s = "ICSE";
				for(int i=0; i<4; i++)
				{
					for(int j=0; j<=i; j++)
						System.out.print(s.charAt(j)+" ");
					System.out.println();
				}
				break;
			default:
				System.out.println("Invalid choice");
		}
		sc.close();
	}
}
