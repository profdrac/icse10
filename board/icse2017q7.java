/*
Question 7.

Write a program to input integer elements into an array of size 20 and
perform the following operations:

(i) Display largest number from the array.
(ii) Display smallest number’from the array.
(iii) Display sum of all the elements of the array

@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2017q7 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[20];
		System.out.println("Numbers are:");
		for(int i=0; i<20; i++){
			n[i] = (int) (Math.random()*100)+1;
			System.out.print(n[i]+" ");
		}
		int small = n[0], large = n[0], sum = 0;
		for(int i=0; i<20; i++){
			if(n[i]<small)
				small = n[i];
			if(n[i]>large)
				large = n[i];
			sum += n[i];
		}
		System.out.println("\nSmallest number is "+small);
		System.out.println("Largest number is "+large);
		System.out.println("Sum of numbers is "+sum);
		sc.close();
	}
}
