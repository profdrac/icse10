package class10.sample;
//@author: Ashutosh Sharma
/*
 * Define a class to accept and store 10 strings into the array and print the strings with even 
number of characters
 */

import java.util.Scanner;

class question7
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[10];
        System.out.print("Enter 10 words: ");
        for(int i=0;i<10;i++)
            a[i]=sc.next();
        System.out.println("Words with even number of characters are:");
        for(int i=0;i<10;i++)
        {
            if(a[i].length()%2==0)
                System.out.print(a[i]+" ");
        }
        sc.close();
    }
}