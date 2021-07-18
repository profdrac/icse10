/*
 *Question 9.

A tech number has even number of digits. If the number is split in two equal halves
then the square of sum of these halves is equal to the number itself.
Write a program to generate and print all four digit tech numbers.

Example :
Consider the number 3025
Square of sum of the halves of 3025 = (30+25)^2
= (55)^2
= 3025 is a tech number

 * @author: Ashutosh Sharma
*/

class icse2019q9 {
	
	public static void main(String args[]) {
		for(int i=1000; i<=9999; i++)
		{
			int p1 = i/100;
			int p2 = i%100;
			int sum = p1+p2;
			if(sum*sum == i)
				System.out.print(i + " ");
		}
        System.out.println("Bye");
	}
}
