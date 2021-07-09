/*
Question 8:
Write a program to input twenty names in an array. Arrange these names in descending order of alphabets, using the bubble sort technique. 

@author: Ashutosh Sharma
*/

import java.util.Scanner;

class icse2015q8 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		for(int i = 0; i<name.length; i++) {
			System.out.print("Enter name: ");
			name[i] = sc.nextLine();
		}

		for(int i = 0; i<name.length; i++) {
			for(int j = 0; j<name.length-1; j++) {
				if(name[j].compareTo(name[j+1]) < 0) {
					String temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted names are: ");
		for(int i = 0; i<name.length; i++)
			System.out.print(name[i]+", ");
		sc.close();
	}
}
