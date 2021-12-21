package class10.sample;
//@author: Ashutosh Sharma
/*
 * Define a class to declare an array of size 20 of double datatype, accept the elements into
the array and perform the following:
• Calculate and print the sum of all the elements.
• Calculate and print the highest value of the array.
 */

import java.util.Scanner;

class question4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double n[]=new double[20];
        System.out.print("Enter 20 numbers:");
        for(int i=0;i<20;i++)
        n[i]=sc.nextDouble();
        double sum=0, highest=n[0];
        for(int i=0;i<20;i++)
        {
            sum += n[i];
            if(n[i]>highest)
            highest = n[i];
        }
        System.out.println("Sum of numbers is "+sum);
        System.out.println("Highest number is "+highest);
        sc.close();
    }
}