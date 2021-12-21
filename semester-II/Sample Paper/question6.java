package class10.sample;
//@author: Ashutosh Sharma
/*
 * Define a class to accept a string, convert it into lowercase and check whether the string is 
a palindrome or not.
A palindrome is a word which reads the same backward as forward.
Example: 
madam, racecar etc
 */

import java.util.Scanner;

class question6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s=sc.next();
        s=s.toLowerCase();
        int l=s.length();
        String rev="";
        for(int i=l-1;i>=0;i--)
        rev += s.charAt(i);
        if(s.equals(rev)==true)
        System.out.print(s+" is palindrome");
        else
        System.out.print(s+" is not palindrome");
        sc.close();
    }
}