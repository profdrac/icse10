package class10.sample;
//@author: Ashutosh Sharma
/*
 * Define a class to declare a character array of size ten, accept the character into the array 
and perform the following:
• Count the number of uppercase letters in the array and print.
• Count the number of vowels in the array and print
 */

import java.util.Scanner;

class question3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        char a[]=new char[10];
        System.out.print("Enter 10 characters:");
        for(int i=0;i<10;i++)
        a[i]=sc.next().charAt(0);
        int cu=0,cv=0;
        for(int i=0;i<10;i++)
        {
            if(Character.isUpperCase(a[i])==true)
            cu++;
            if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            cv++;
        }
        System.out.println("Uppercase letters are "+cu);
        System.out.println("Vowels are "+cv);
        sc.close();
    }
}