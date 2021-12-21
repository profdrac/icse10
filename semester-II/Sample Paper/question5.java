package class10.sample;
//@author: Ashutosh Sharma
/*
 * Define a class to accept two strings, convert them into uppercase, check and display
whether two strings are equal or not, if the two strings are not equal, print the string with
the highest length or print the message both the strings are of equal length.
 */

import java.util.Scanner;

class question5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string one: ");
        String a=sc.nextLine();
        a=a.toUpperCase();
        System.out.print("Enter string two: ");
        String b=sc.nextLine();
        b=b.toUpperCase();
        if(a.length()==b.length())
            System.out.println("Both strings are of same length");
        else
        {
            if(a.length()>b.length())
                System.out.println(a+" is bigger");
            else
                System.out.println(b+" is bigger");
        }
        sc.close();
    }
}