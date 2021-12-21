package class10.sample;
//@author: Ashutosh Sharma
/*
 * Define a class to declare an integer array of size n and accept the elements into the array.
Search for an element input by the user using linear search technique, display the element
if it is found, otherwise display the message “NO SUCH ELEMENT.
 */

import java.util.Scanner;

class question2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("What should be the size of your array? ");
        int n=sc.nextInt();
        int numbers[] = new int[n];
        System.out.print("Enter "+n+" numbers to be stored: ");
        for(int i=0;i<n;i++)
        numbers[i]=sc.nextInt();
        System.out.print("Enter number to be searched in array: ");
        int x=sc.nextInt();
        boolean isFound=false;
        for(int i=0;i<n;i++)
        {
            if(numbers[i]==x)
            {
                isFound=true;
                break;
            }
        }
        if(isFound==true)
        System.out.print("Number found");
        else
        System.out.print("NO SUCH ELEMENT");
        sc.close();
    }
}