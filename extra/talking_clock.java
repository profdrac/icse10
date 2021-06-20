/*
Challenge #321 [Easy] Talking Clock

Description
No more hiding from your alarm clock! You've decided you want your computer to keep you updated on the time so you're never late again. A talking clock takes a 24-hour time and translates it into words.
Input Description
Ask An hour (0-23) and then ask minutes (0-59).
Output Description
The time in words, using 12-hour format followed by am or pm.
Sample Input data
00 00
01 30
12 05
14 01
20 29
21 00
Sample Output data
It's twelve am
It's one thirty am
It's twelve five pm
It's two one pm
It's eight twenty nine pm
It's nine pm

Solution: Ashutosh Sharma
*/
import java.util.Scanner;

class talking_clock
{
    public void getHours(int h)
    {
        switch(h)
        {
            case 0:
            System.out.print("Twelve");
            break;
            case 1:
            System.out.print("One");
            break;
            case 2:
            System.out.print("Two");
            break;
            case 3:
            System.out.print("Three");
            break;
            case 4:
            System.out.print("Four");
            break;
            case 5:
            System.out.print("Five");
            break;
            case 6:
            System.out.print("Six");
            break;
            case 7:
            System.out.print("Seven");
            break;
            case 8:
            System.out.print("Eight");
            break;
            case 9:
            System.out.print("Nine");
            break;
            case 10:
            System.out.print("Ten");
            break;
            case 11:
            System.out.print("Eleven");
            break;
        }
        System.out.print(" ");
    }

    public void getMinutes(int m)
    {
        switch(m)
        {
            case 1:
            System.out.print("One");
            break;
            case 2:
            System.out.print("Two");
            break;
            case 3:
            System.out.print("Three");
            break;
            case 4:
            System.out.print("Four");
            break;
            case 5:
            System.out.print("Five");
            break;
            case 6:
            System.out.print("Six");
            break;
            case 7:
            System.out.print("Seven");
            break;
            case 8:
            System.out.print("Eight");
            break;
            case 9:
            System.out.print("Nine");
            break;
            case 10:
            System.out.print("Ten");
            break;
            case 11:
            System.out.print("Eleven");
            break;
            case 12:
            System.out.print("Twelve");
            break;
            case 13:
            System.out.print("Thirteen");
            break;
            case 14:
            System.out.print("Fourteen");
            break;
            case 15:
            System.out.print("Fifteen");
            break;
            case 16:
            System.out.print("Sixteen");
            break;
            case 17:
            System.out.print("Seventeen");
            break;
            case 18:
            System.out.print("Eighteen");
            break;
            case 19:
            System.out.print("Nineteen");
            break;
            case 20:
            System.out.print("Twenty");
            break;
            case 30:
            System.out.print("Thirty");
            break;
            case 40:
            System.out.print("Fourty");
            break;
            case 50:
            System.out.print("Fifty");
            break;
        }
        System.out.print(" ");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        talking_clock o = new talking_clock();
        System.out.print("Enter hours[00-23]: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes[00-59]: ");
        int m = sc.nextInt();
        System.out.print("It\'s ");
        //get hours in words
        if(h<12)
            o.getHours(h);
        else
            o.getHours(h-12);
        //get minutes in words
        if(m>20)
        {
            int d1 = (m/10)*10;
            int d2 = m%10;
            o.getMinutes(d1);
            o.getMinutes(d2);
        }
        else
            o.getMinutes(m);
        //is it AM or PM?
        if(h<12)
            System.out.print("AM");
        else
            System.out.print("PM");
        sc.close();
    }    
}
