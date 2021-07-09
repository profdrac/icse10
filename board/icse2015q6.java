/*
Question 6:

Write a program to input and store roll numbers, names and marks in 3 subjects of 
n number students in five single dimensional array and display the remark based on 
average marks as given below : (The maximum marks in the subject are 100)

Average marks = total/3

Average marks	Remark
------------	-----
85-100		Excellent
75-84		Distinction
60-74		First Class
40-59		Pass
<40		Poor
*/

import java.util.Scanner;

class icse2015q6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students are there? ");
		int n = sc.nextInt();
		int roll[] = new int[n];
		String name[] = new String[n];
		int m1[] = new int[n];
		int m2[] = new int[n];
		int m3[] = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Enter roll-number, name and marks in 3 subjects of student "+(i+1));
			roll[i] = sc.nextInt();
			name[i] = sc.nextLine();
			m1[i] = sc.nextInt();
			m2[i] = sc.nextInt();
			m3[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			int avg = (m1[i]+m2[i]+m3[i])/3;
			if(avg>= 85 && avg<=100)
				System.out.println("Excellent");
			else if(avg>=75 && avg<=84)
				System.out.println("Distinction");
			else if(avg>=60 && avg<=74)
				System.out.println("First Class");
			else if(avg>=40 && avg<=59)
				System.out.println("Pass");
			else
				System.out.println("Poor");
		}
		sc.close();
	}
}
