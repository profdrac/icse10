/*
 *Question 9.

Write a program to accept name and total marks of N number of students in two single subscript array name[] and totalmarks[ ]

Calculate and print:

(i) The average of the total marks obtained by N Number of students.
[average = (sum of total marks of all the students)/N]

(ii) Deviation of each student’s total marks with the average.
[deviation = total marks of a student – average]

 * @author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2018q9 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students are there? ");
		int n = sc.nextInt();
		String name[] = new String[n];
		int totalmarks[] = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++){
			System.out.print("Enter name and marks of student number "+(i+1)+": ");
			name[i] = sc.nextLine();
			totalmarks[i] = sc.nextInt();
			sum += totalmarks[i];
		}
		double avg = sum/n;
		System.out.println("Average marks are "+avg);
		for(int i=0; i<n; i++)
			System.out.println("Deviation of student "+(i+1)+" is "+(totalmarks[i]-avg));
		sc.close();
	}
}
