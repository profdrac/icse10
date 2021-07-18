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
	
	public static void main(String args[])
	{
		for(int i=1000; i<=9999; i++)
		{
			if(Math.pow((i/100)+(i%100), 2) == i)
				System.out.println(i);
		}
	}
}
