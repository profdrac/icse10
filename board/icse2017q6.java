/*
Question 6.
Using switch statement, write a menu driven program for the following :

(i) To find and display the sum of the series given below :
S = x1 -x2 + x2 – x4 + x5 – x20
(where x = 2)

(ii) To display the following series :
1 11 111 1111 11111

For an incorrect option, an appropriate error message should be displayed.
@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2017q6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] Sum of series");
		System.out.println("[2] Print series");
		System.out.print("Enter ypur choice: ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.print("Enter value of x: ");
				int x = sc.nextInt();
				double sum = 0;
				int sign = 1;
				for(int i=1; i<=20; i++){
					sum += Math.pow(x, i)*sign;
					sign *= -1;
				}
				System.out.println("Sum of series is "+sum);
				break;
			case 2:
				x = 0;
				for(int i=1; i<=5; i++){
					x = x*10 + 1;
					System.out.print(x+" ");
				}
				break;
			default:
				System.out.println("Invalid choice");
		}
		sc.close();
	}
}
